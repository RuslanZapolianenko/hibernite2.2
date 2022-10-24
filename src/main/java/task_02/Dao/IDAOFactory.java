package task_02.Dao;

public interface IDAOFactory { CarDAO getCarDAO();

    ClientDAO getClientDAO();
}

