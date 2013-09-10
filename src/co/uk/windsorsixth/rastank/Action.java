package co.uk.windsorsixth.rastank;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
/**
 * 
 * @author cammygames
 *
 */
public class Action 
{
	private final static GpioController gpio = GpioFactory.getInstance();

	/**
	 * Register all the Pins used to control the Car
	 */
	private final static GpioPinDigitalOutput pin11 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11, "MotorBack", PinState.LOW);
	private final static GpioPinDigitalOutput pin12 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12, "MotorForwards", PinState.LOW);
	private final static GpioPinDigitalOutput pin13 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13, "MotorLeft", PinState.LOW);
	private final static GpioPinDigitalOutput pin15 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15, "MotorRight", PinState.LOW);
	
	/**
	 * Move The car forward
	 */
	public static void moveForward() throws InterruptedException
	{
		System.out.println("[INFO] : Movign Forward !");
		pin12.toggle();
		System.out.println("[INFO] : GPIO Pin 12 Now ON !");
		Thread.sleep(5000);
	}
	
	public static void eStop() throws InterruptedException
	{
		System.out.println("[INFO] : Stopping All pins !");
		
		gpio.shutdown();
		
		System.out.println("[INFO] : Stopped !");
		Thread.sleep(10000);
	}
	
	public static void moveBack() throws InterruptedException
	{
		System.out.println("[INFO] : Movign Backwards !");
		pin12.low();
		pin11.toggle();
		System.out.println("[INFO] : GPIO Pin 11 Now ON !");
		Thread.sleep(5000);
	}

	public static void moveLeft() throws InterruptedException
	{
		System.out.println("[INFO] : Movign Left !");
		pin15.low();
		pin13.toggle();
		System.out.println("[INFO] : GPIO Pin 13 Now ON !");
		Thread.sleep(5000);
	}
	
	public static void moveRight() throws InterruptedException
	{
		System.out.println("[INFO] : Movign Right !");
		pin13.low();
		pin15.toggle();
		System.out.println("[INFO] : GPIO Pin 15 Now ON !");
		Thread.sleep(5000);
	}
}
