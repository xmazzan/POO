package reinoanimalia;

public class Leao extends Felino{
    private String urro;

    public String geturro() {
        return urro;
    }

    public void seturro(String urro) {
        this.urro = urro;
    }

    @Override
    public String fazOUrro() {
        return "Leão faz: " + urro;
    }

}
