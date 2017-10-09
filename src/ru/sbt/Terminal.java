package ru.sbt;

/**
 * Created by Диана on 09.10.2017.
 */
public interface Terminal {
    public boolean enter(String account, String pin) throws AccountIsLockedException;
    public boolean getMoney(int money, String pin) throws AccountIsLockedException, IncorrectValueException,
            NotEnoughMoneyException;
    public boolean getBalance(String pin) throws AccountIsLockedException;

}
