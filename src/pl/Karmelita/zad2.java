package pl.Karmelita;
//Napisz  program  obliczający  BMI  (Body  Mass  Index)  i  sprawdzający,  czy  jest  ono  w normie.  Program  powinien
// wczytywać  od  użytkownika  dwie  zmienne:  wagę  w kilogramach (typ float) oraz wzrost w centymetrach (typ int).
// BMI powinno zostać wyliczone zgodnie z poniższym wzorem: Optymalny  zakres  BMI  wynosi  od  18.5  do  24.9,
// wartości  mniejsze  lub  większe  są wartościami nieoptymalnymi.Twój program powinien wypisać „BMI optymalne” l
// ub „BMI nieoptymalne”, zgodnie z powyższymi założeniami.

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj swoją wagę");
    float waga=scanner.nextFloat();
    System.out.println("Podaj swój wzrost w cm");

}
