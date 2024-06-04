package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer zapewnia prostą implementację stosu
 * o stałej pojemności, używaną do demonstrowania podstawowych operacji na strukturach danych.
 */
public class DefaultCountingOutRhymer {

    /**
     * Stała reprezentująca stan pusty.
     */
    public static final int EMPTY = -1;

    /**
     * Stała reprezentująca pojemność stosu.
     */
    public static final int CAPACITY = 12;

    /**
     * Tablica do przechowywania elementów stosu.
     */
    private final int[] numbers = new int[CAPACITY];

    /**
     * Indeks ostatniego elementu na stosie, lub EMPTY, jeśli stos jest pusty.
     */
    private int total = EMPTY;

    /**
     * Dodaje element do stosu, jeśli nie jest pełny.
     *
     * @param in element do dodania do stosu
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true, jeśli stos jest pusty, w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true, jeśli stos jest pełny, w przeciwnym razie false
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    /**
     * Zwraca ostatni dodany element na stosie bez jego usuwania.
     *
     * @return ostatni element na stosie, lub EMPTY, jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca ostatni dodany element na stosie.
     *
     * @return ostatni element na stosie, lub EMPTY, jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}