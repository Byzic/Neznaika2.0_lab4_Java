package places;

public class HeightException extends Exception {               // ошибка вылазит, если
    public HeightException(String message) {
        super(message);
    }// высота шара над землей <=0
}
