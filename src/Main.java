import model.CalculatorModel;
import presenter.CalculatorPresenter;
import view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView(null);
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);
        view = new CalculatorView(presenter);
    }
}
