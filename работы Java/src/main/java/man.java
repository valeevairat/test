public class man{
    public man() {
    }

    public man(String name) {
        this.name = name;
    }

    private int legs = 2;

    private int hands = 2;

    private int body = 1;

    public String name;


    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "man{" +
                "legs=" + legs +
                ", hands=" + hands +
                ", body=" + body +
                ", name='" + name + '\'' +
                '}';
    }
}
