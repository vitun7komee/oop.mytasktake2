package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest
{
    @Test
        public void testTurnOn() {
            SmartLamp lamp = new SmartLamp();
            ICommand SmartLampOn = new SmartLampOn(lamp);
            RemoteControl remoteControl = new RemoteControl();
            remoteControl.setCommand(SmartLampOn);
            remoteControl.pressButton();
            assertTrue(lamp.isOn);
        }
    
        @Test
        public void testTurnOff() {
            SmartLamp lamp = new SmartLamp();

            ICommand SmartLampOn = new SmartLampOn(lamp);
            RemoteControl remoteControl = new RemoteControl();
            remoteControl.setCommand(SmartLampOn);
            remoteControl.pressButton();

            ICommand SmartLampOff = new SmartLampOff(lamp);
            remoteControl.setCommand(SmartLampOff);
            remoteControl.pressButton();
            assertTrue(!lamp.isOn);
        }
    
        @Test
        public void testIncreaseBrightness() {
            SmartLamp lamp = new SmartLamp();
            int result = 55;
            ICommand IncreaseBrightness = new SmartLampIncreaseBrightness(lamp);
            RemoteControl remoteControl = new RemoteControl();
            remoteControl.setCommand(IncreaseBrightness);
            remoteControl.pressButton();
            assertEquals((int)result, (int)lamp.getBrightness());
        }
    
        @Test
        public void testDecreaseBrightness() {
            SmartLamp lamp = new SmartLamp();
            int result = 45;
            ICommand DecreaseBrightness = new SmartLampDecreaseBrightness(lamp);
            RemoteControl remoteControl = new RemoteControl();
            remoteControl.setCommand(DecreaseBrightness);
            remoteControl.pressButton();
            assertEquals((int)result, (int)lamp.getBrightness());
        }
    
        @Test
        public void testSetMode() {
            SmartLamp lamp = new SmartLamp();
            lamp.setMode(SmartLampMode.NIGHT);
            assertEquals("NIGHT" , lamp.getMode());
        }
}
