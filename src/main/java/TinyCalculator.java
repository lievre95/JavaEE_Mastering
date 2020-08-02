import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
@Named
@RequestScoped
public class TinyCalculator {
    public TinyCalculator() {
    }

    private double _param1;
    private double _param2;
    private double _result;

    public void setParam1(double _param1) {
        this._param1 = _param1;
    }

    public void setParam2(double _param2) {
        this._param2 = _param2;
    }

    public void setResult(double result) {
        this._result = result;
    }

    public double getParam1() {
        return _param1;
    }

    public double getParam2() {
        return _param2;
    }

    public double getResult() {
        return _result;
    }

    public String add() {
        _result = _param1 + _param2;
        return "";
    }

    public String subtract() {
        _result = _param1 - _param2;
        return "";
    }

    public String multiply() {
        _result = _param1 + _param2;
        return "";
    }

    public String divide() {
        _result = _param1 + _param2;

    return "";
    }


}

