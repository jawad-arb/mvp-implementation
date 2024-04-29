package presenter;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void add(int a, int b) {
        int result = model.add(a, b);
        view.setResult(result);
    }

    public void subtract(int a, int b) {
        int result = model.subtract(a, b);
        view.setResult(result);
    }

    public void multiply(int a, int b) {
        int result = model.multiply(a, b);
        view.setResult(result);
    }

    public void divide(int a, int b) {
        try {
            int result = model.divide(a, b);
            view.setResult(result);
        } catch (IllegalArgumentException e) {
            view.setResult(Integer.MIN_VALUE);  // Handle division by zero error
        }
    }
}

