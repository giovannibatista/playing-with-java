package me.java17.sealed;

sealed class Device permits Computer, Mobile{
}

//Com sealed é permitido apenas extender as classe que foram declaradas com permits
sealed class Computer extends Device permits Laptop, Desktop {

}

final class Mobile extends Device {
}

non-sealed class Laptop extends Computer{

}
//Com final, nunhuma clase pode mais extender
final class Desktop extends Computer {
}

//Com non-sealed, qualquer classe pode ser extendida
class Dell extends Laptop{

}
