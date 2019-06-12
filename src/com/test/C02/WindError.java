package com.test.C02;

class NoteX {
public static final int
MIDDLE_C = 0, C_SHARP = 1, C_FLAT = 2;
}
class InstrumentX {
public void play(int NoteX) {
System.out.println("InstrumentX.play()");
}
}
class WindX extends InstrumentX {
// OOPS! Changes the method interface:
public void play(NoteX n) {
System.out.println("WindX.play(NoteX n)");
}
}
public class WindError {
public static void tune(InstrumentX i) {
// ...
i.play(NoteX.MIDDLE_C);
}
public static void main(String[] args) {
WindX flute = new WindX();
NoteX xx = new NoteX();
WindX yy = new WindX();
yy.play(NoteX.C_FLAT);
yy.play(null);
tune(flute); // Not the desired behavior!
}
}
