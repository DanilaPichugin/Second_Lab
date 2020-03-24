public class U0901WorkArray<T extends Number> {
    T[] arrNums;

    U0901WorkArray(T[] numP){
        arrNums=numP;
    }

    double sum(){
        double doubleWorks = 0;
        for(T a: arrNums){
            doubleWorks += a.doubleValue();
        }
        return doubleWorks;
    }
}
