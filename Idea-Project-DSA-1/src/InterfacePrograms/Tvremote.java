package InterfacePrograms;

public interface Tvremote {
void increaseDisplayBrightness();
void increaseSound();
}
interface smartTv extends Tvremote{
    void surroundSound();
    void Dolbysound();
    void screenCasting();
}
class Tv implements smartTv{
    @Override
    public void increaseDisplayBrightness() {
        System.out.println("Please increase Display Brightness for best Display Experience");
    }

    @Override
    public void Dolbysound() {
        System.out.println("Please watch movie in new smartTv for best dolby sound experience");
    }

    @Override
    public void screenCasting() {
        System.out.println("Please use modern smart Tv for use screen Casting ");
    }

    @Override
    public void increaseSound() {
        System.out.println("Increase sound of smart tv for audible noice");
    }

    @Override
    public void surroundSound() {
        System.out.println("Please use surround sound technology for best audio experience in movie");
    }

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.Dolbysound();
        tv.increaseSound();
        tv.increaseDisplayBrightness();
        tv.screenCasting();
        tv.surroundSound();
    }
}
