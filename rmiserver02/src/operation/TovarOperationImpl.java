package operation;

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;

import java.util.ArrayList;

import java.util.List;

import types.Tovar;

public class TovarOperationImpl extends UnicastRemoteObject implements TovarOperation{
static List<Tovar> lstTovar = new ArrayList<Tovar>();
static{
lstTovar.add(new Tovar("Товар1", 10, 100));
lstTovar.add(new Tovar("Товар2", 20, 200));
lstTovar.add(new Tovar("Товар3", 30, 300));
lstTovar.add(new Tovar("Товар4", 40, 400));
}

@Override
public List<Tovar> getListOfTovar() throws RemoteException{
return lstTovar;
}

@Override
public List<Tovar> addNewTovar(Tovar tovar) throws RemoteException{

lstTovar.add(tovar);

return lstTovar;

}

@Override
public int getSumOfTovar() throws RemoteException{

int sum = 0;

for(Tovar tovar: lstTovar)

sum += tovar.getSumma();

return sum;

}
public TovarOperationImpl() throws RemoteException{
}
}