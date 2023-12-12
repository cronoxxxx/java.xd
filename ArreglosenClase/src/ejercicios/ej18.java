package ejercicios;

import java.io.IOException;
public class ej18 {
        public static void main(String[] args) throws IOException {
            char currentChar;
            boolean waitingForSTOP = false;
            while ((currentChar = (char) System.in.read()) != (char) -1) {
                if (waitingForSTOP) {
                    if (currentChar == 'T' || currentChar == 't') {
                        waitingForSTOP = true;
                    } else if (currentChar == 'O' || currentChar == 'o') {
                        waitingForSTOP = true;
                    } else if (currentChar == 'P' || currentChar == 'p') {
                        System.out.println("STOP command received, exiting");
                        break;
                    } else {
                        waitingForSTOP = false;
                    }
                } else if (currentChar == 'S' || currentChar == 's') {
                    waitingForSTOP = true;
                }
            }
        }
    }

