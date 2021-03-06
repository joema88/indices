package com.sda.automation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import com.sun.tools.javac.Main;

import org.sikuli.script.Pattern;
import java.util.*;

public class StockCX520 {

	public static void main(String[] args) {
	
	}

	
	public static void process(String symbol) {
		Pattern input = new Pattern("C:\\Users\\bpmadmin\\Desktop\\ThinkOrSwim\\pictures\\input.PNG");
		Pattern highlight1 = new Pattern("C:\\Users\\bpmadmin\\Desktop\\ThinkOrSwim\\pictures\\H1CX520.PNG");
		Pattern highlight2 = new Pattern("C:\\Users\\bpmadmin\\Desktop\\ThinkOrSwim\\pictures\\H2CX520.PNG");
		Pattern highlight3 = new Pattern("C:\\Users\\bpmadmin\\Desktop\\ThinkOrSwim\\pictures\\H3CX520.PNG");

		Pattern report = new Pattern("C:\\Users\\bpmadmin\\Desktop\\ThinkOrSwim\\pictures\\report.PNG");
		Pattern export = new Pattern("C:\\Users\\bpmadmin\\Desktop\\ThinkOrSwim\\pictures\\export.PNG");
		Pattern fileName = new Pattern("C:\\Users\\bpmadmin\\Desktop\\ThinkOrSwim\\pictures\\fileName.PNG");
		Pattern save = new Pattern("C:\\Users\\bpmadmin\\Desktop\\ThinkOrSwim\\pictures\\save.PNG");
		Pattern close = new Pattern("C:\\Users\\bpmadmin\\Desktop\\ThinkOrSwim\\pictures\\close.PNG");

		
			try {
				//String symbol = en.nextElement().toString();
				Screen s = new Screen();
				s.find(input);
				s.type(input, symbol);
				s.keyDown(Key.ENTER);
				s.keyUp(Key.ENTER);
				for (int i = 0; i < symbol.length(); i++) {
					s.keyDown(Key.BACKSPACE);
					s.keyUp(Key.BACKSPACE);
				}
				boolean find = false;

				if (!find) {
					try {
						s.wait(highlight1.similar((double) 0.6), 6000);
						s.rightClick();
						find = true;
					} catch (Exception ex) {
						find = false;

					}
				}
				if (!find) {
					try {
						s.wait(highlight2.similar((double) 0.6), 4000);
						s.rightClick();
						find = true;
					} catch (Exception ex) {
						find = false;

					}
				}
				if (!find) {
					try {
						s.wait(highlight3.similar((double) 0.6), 4000);
						s.rightClick();
						find = true;
					} catch (Exception ex) {
						find = false;

					}
				}
				s.wait(report.similar((double) 0.9), 2000);
				// s.find(report.similar((double)0.9));
				s.click();
				s.wait(export.similar((double) 0.9), 2000);
				s.click();
				s.wait(fileName.similar((double) 0.9), 2000);
				s.click();
				for (int i = 0; i < 5; i++) {
					s.keyDown(Key.BACKSPACE);
					s.keyUp(Key.BACKSPACE);
				}
				s.write("CX520");
				s.find(save).click();
				s.find(close).click();
			} catch (Exception ex) {
				ex.printStackTrace(System.out);
			}
		
	}
}
