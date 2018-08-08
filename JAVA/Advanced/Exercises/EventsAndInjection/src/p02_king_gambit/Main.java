package p02_king_gambit;

import p02_king_gambit.interfaces.Attackable;
import p02_king_gambit.interfaces.Mortal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String kingsName = reader.readLine();
        Attackable king = new King(kingsName);
        String[] royals = reader.readLine().split(" ");
        for (String royal : royals) {
            Mortal newRoyal = new RoyalGuard(royal);
            ((King) king).addMortal(newRoyal);
        }
        String[] footmen = reader.readLine().split(" ");
        for (String footman : footmen) {
            Mortal newFootman = new Footman(footman);
            ((King) king).addMortal(newFootman);
        }

        while (true) {
            String input = reader.readLine();

            if ("End".equals(input)) {
                break;
            }

            if ("Attack King".equals(input)) {
                king.takeAttack();
            }else {
                String[] arr = input.split(" ");
                ((King) king).killMortal(arr[1]);
            }
        }
    }
}
