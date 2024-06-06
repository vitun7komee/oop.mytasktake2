package com.example;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartLampStart {

    public static void run(SmartLamp smartLamp) throws InterruptedException {
        ICommand SmartLampOn = new SmartLampOn(smartLamp);
        ICommand SmartLampOff = new SmartLampOff(smartLamp);
        ICommand SmartLampIncreaseBrightness = new SmartLampIncreaseBrightness(smartLamp);
        ICommand SmartLampDecreaseBrightness = new SmartLampDecreaseBrightness(smartLamp);
        ICommand SmartLampSetMode = new SmartLampSetMode(smartLamp, SmartLampMode.EVENING);

        RemoteControl remoteControl = new RemoteControl();

        List<ICommand> commands = List.of(SmartLampOn, SmartLampSetMode);
        executeCommands(remoteControl, commands);

        Integer SmartLampBrightness = smartLamp.getBrightness();
        if (SmartLampBrightness < 75) {
            commands = List.of(SmartLampIncreaseBrightness);
            executeCommands(remoteControl, commands);
            while (smartLamp.getBrightness() < 75) {
                TimeUnit.MILLISECONDS.sleep(800);
                executeCommands(remoteControl, commands);
            }
        } else if (SmartLampBrightness > 75) {
            commands = List.of(SmartLampDecreaseBrightness);
            executeCommands(remoteControl, commands);
        }
        executeCommands(remoteControl,List.of(SmartLampOff));
    }

    private static void executeCommands(RemoteControl remoteControl, List<ICommand> commands) {
        remoteControl.setCommands(commands);
        remoteControl.pressAllButtons();
    }
}
