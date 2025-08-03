public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int numberOfMinutesAlreadyInOven) {
        return expectedMinutesInOven() - numberOfMinutesAlreadyInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int numberOfMinutesAlreadyInOven) {
        return preparationTimeInMinutes(layers) + numberOfMinutesAlreadyInOven;
    }
}
