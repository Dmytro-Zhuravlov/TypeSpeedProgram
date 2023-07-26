/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package typespeedprogram;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Dmytro
 */
public class TypeSpeedProgram {

    static String[] words = {"my", "first", "type", "speed", "program"};
    
    public static void main(String[] args) throws InterruptedException {
        Scanner typeIn = new Scanner(System.in);
        System.out.println("How many words you want to print?");
        int numberOfWords = typeIn.nextInt();
        typeIn.nextLine();

        for(int i = 3; i > 0; i --) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        
        Random randomWords = new Random();
        for(int i = 0; i < numberOfWords; i++) {
            System.out.print(words[randomWords.nextInt(words.length)] + " ");
            
        }
        System.out.println("");
        double typeStart = LocalTime.now().toNanoOfDay();
        String type = typeIn.nextLine();
        double typeEnd = LocalTime.now().toNanoOfDay();
        
        double typeTime = (typeEnd - typeStart) / 1000000000.0;
        double wpm = numberOfWords / (typeTime / 60);
//        System.out.println(String.format("Your type time is: %.3f", typeTime));
    System.out.println(String.format("Words per minute: " + (int)wpm));
    }
    
}
