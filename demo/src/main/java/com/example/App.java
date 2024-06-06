package com.example;
public class App {
    public static void main(String[] args) throws Exception {

        SmartLamp SmartLamp = new SmartLamp();

        // ICommand SmartLampOn = new SmartLampOn(SmartLamp);
        // RemoteControl remoteControl = new RemoteControl();
        // remoteControl.setCommand(SmartLampOn);
        // remoteControl.pressButton();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("- Start State -");
        System.out.println("BRIGHTNESS: " + SmartLamp.getBrightness());
        System.out.println("MODE: " + SmartLamp.getMode());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        try {
            SmartLampStart.run(SmartLamp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ICommand SmartLampOff = new SmartLampOff(SmartLamp);
        // remoteControl.setCommand(SmartLampOff);
        // remoteControl.pressButton();





        
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ICommand SmartLampOn = new SmartLampOn(SmartLamp);
        // ICommand SmartLampOff = new SmartLampOff(SmartLamp);

        // ICommand SmartLampIncreaseBrightness = new SmartLampIncreaseBrightness(SmartLamp);
        // ICommand SmartLampDecreaseBrightness = new SmartLampDecreaseBrightness(SmartLamp);
        
        // ICommand SmartLampSetMode = new SmartLampSetMode(SmartLamp, SmartLampMode.EVENING);

        // RemoteControl remoteControl = new RemoteControl();

        // System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        // System.out.println("- Start State -");
        // System.out.println("BRIGHTNESS: " + SmartLamp.getBrightness());
        // System.out.println("MODE: " + SmartLamp.getMode());
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // List<ICommand> commands = List.of(SmartLampOn, SmartLampSetMode);
        // remoteControl.setCommands(commands);
        // remoteControl.pressAllButtons();

        // System.out.println("- Current State -");
        // Integer SmartLampBrightness = SmartLamp.getBrightness();
        // if (SmartLampBrightness < 75) {
        //     commands = List.of(SmartLampIncreaseBrightness);
        //     remoteControl.setCommands(commands);
        //     while (SmartLamp.getBrightness() < 75) {
        //         remoteControl.pressAllButtons();
        //         TimeUnit.MILLISECONDS.sleep(800);
        //     }
        // } else if (SmartLampBrightness > 75) {
        //     commands = List.of(SmartLampDecreaseBrightness);
        //     remoteControl.setCommands(commands);
        //     remoteControl.pressAllButtons();
        // }
        // remoteControl.setCommand(SmartLampOn);
        // remoteControl.pressButton();
        




        // System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        // System.out.println("- Start State -");
        // SmartLamp.getBrightness();
        // System.out.println("BRIGHTNESS: " + SmartLamp.getBrightness());
        // SmartLamp.getMode();
        // System.out.println("MODE: " + SmartLamp.getMode());
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // System.out.println("- Current State -");
        // Integer SmartLampBrightness = SmartLamp.getBrightness();
        // if (SmartLampBrightness < 75)
        // {
        //     remoteControl.setCommand(SmartLampIncreaseBrightness);
        //     while (SmartLamp.getBrightness() < 75) {
        //         remoteControl.pressButton();
        //         TimeUnit.MILLISECONDS.sleep(800);
        //     }
        // }
        // else if (SmartLampBrightness > 75) {
        //     remoteControl.setCommand(SmartLampDecreaseBrightness);
        //     remoteControl.pressButton();
        // }

        // remoteControl.setCommand(SmartLampSetMode);
        // remoteControl.pressButton();

        // //TimeUnit.MILLISECONDS.sleep(2000);

        // remoteControl.setCommand(SmartLampOff);
        // remoteControl.pressButton();
    }
}
