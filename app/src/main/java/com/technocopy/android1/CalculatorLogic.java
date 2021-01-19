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
        // ограничиваем ввод чисел 15 цифрами
        if (inputString.length() < 15){
            switch (id){
                case R.id.button0:
                    if (inputString.length() != 0){     // добавляем 0 только когда он не стоит в начале
                        inputString.append("0");
                    }
                    break;
                case R.id.button1:
                        inputString.append("1");
                    break;
                case R.id.button2:
                        inputString.append("2");
                    break;
                case R.id.button3:
                    inputString.append("3");
                    break;
                case R.id.button4:
                    inputString.append("4");
                    break;
                case R.id.button5:
                    inputString.append("5");
                    break;
                case R.id.button6:
                    inputString.append("6");
                    break;
                case R.id.button7:
                    inputString.append("7");
                    break;
                case R.id.button8:
                    inputString.append("8");
                    break;
                case R.id.button9:
                    inputString.append("9");
                    break;
            }
        }
    }


    // нажатие на кнопки действий
    public void onActionPress(int actoinId){

    }


    // перечисляем аргументы действия
    private enum State {
        argFirstInput,
        argSecondInput,
        result
    }

    public String getText(){
        return inputString.toString();
    }
}
