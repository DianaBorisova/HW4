package ru.sbt;

/**
 * Created by Диана on 09.10.2017.
 */
public class TerminalImpl implements Terminal{

    private final TerminalServer server;
    private final PinValidator pinValidator;

    public TerminalImpl() {
        server = new TerminalServer();
        pinValidator = new PinValidator();
    }


    @Override
    public boolean enter(String account, String pin) throws AccountIsLockedException {

        return false;
    }

    @Override
    public boolean getMoney(int money, String pin) throws AccountIsLockedException, IncorrectValueException, NotEnoughMoneyException {
        return false;
    }

    @Override
    public boolean getBalance(String pin) throws AccountIsLockedException {
        return false;
    }
}
