package de.neuefische.task;

public class Sack{
    private int[] numbers;

    public Sack(int[] numbers){
        this.numbers = numbers;
    }

    public void add(int number){
        int[] newNumbers = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        newNumbers[newNumbers.length - 1] = number;
        numbers = newNumbers;
    }

    public int get(int index){
        return numbers[index];
    }

    public int size(){
        return numbers.length;
    }

    public void remove(int index){
        int[] newNumbers = new int[numbers.length - 1];
        System.arraycopy(numbers, 0, newNumbers, 0, index);
        System.arraycopy(numbers, index + 1, newNumbers, index, numbers.length - index - 1);
        numbers = newNumbers;
    }

    public void removeLast(){
        remove(numbers.length - 1);
    }
}
