package com.technocopy.android1;

public class CalculatorLogic {
    private final ResOut resOut;
    StringBuilder inputString = new StringBuilder();
    private int argFirst;
    private int argSecond;


    // конструктор для поля с первым числом
    public CalculatorLogic() {
        resOut = ResOut.argFirstInput;
    }

    // нажатие на кнопки с цифрами
    private void onNumberPress(int numberId){

    }

    // нажатие на кнопки действий
    private void onActionPress(int actoinId){

    }

    private enum ResOut {
        argFirstInput,
        argSecondInput,
        result
    }
}
