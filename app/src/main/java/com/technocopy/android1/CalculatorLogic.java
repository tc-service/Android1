package com.technocopy.android1;

import androidx.constraintlayout.solver.state.State;

public class CalculatorLogic {

    StringBuilder inputString = new StringBuilder();
    private int argFirst;
    private int argSecond;

    private State state;


    // конструктор для поля с первым числом
    public CalculatorLogic() {

        state = State.argFirstInput;
    }

    // нажатие на кнопки с цифрами
    public void onNumPress(int id) {
    }


    // нажатие на кнопки действий
    void onActionPress(int actoinId){

    }


    // перечисляем аргументы действия
    private enum State {
        argFirstInput,
        argSecondInput,
        result
    }
}
