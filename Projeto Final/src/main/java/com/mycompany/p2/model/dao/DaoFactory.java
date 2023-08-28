package com.mycompany.p2.model.dao;

import com.mycompany.p2.db.DB;
import com.mycompany.p2.model.dao.impl.BackupPedidoDaoJDBC;
import com.mycompany.p2.model.dao.impl.CategoriaDaoJDBC;
import com.mycompany.p2.model.dao.impl.ClienteDaoJDBC;
import com.mycompany.p2.model.dao.impl.PedidoDaoJDBC;
import com.mycompany.p2.model.dao.impl.ProdutoDaoJDBC;
import com.mycompany.p2.model.dao.impl.ProdutosGeraisDaoJDBC;
import com.mycompany.p2.model.dao.impl.RelatorioGeralDaoJDBC;
import com.mycompany.p2.model.dao.impl.TransportadoraDaoJDBC;
import java.sql.Connection;

public class DaoFactory {

    public static ClienteDao createClienteDao() throws ClassNotFoundException {
        return new ClienteDaoJDBC(DB.getConnection());
    }
  
    public static BackupPedidoDao createBackupPedidoDao() throws ClassNotFoundException {
        return new BackupPedidoDaoJDBC(DB.getConnection());
    }
  
    public static CategoriaDao createCategoriaDao() throws ClassNotFoundException {
        return new CategoriaDaoJDBC(DB.getConnection());
    }
  
    public static PedidoDao createPedidoDao() throws ClassNotFoundException {
        return new PedidoDaoJDBC(DB.getConnection());
    }
  
    public static ProdutoDao createProdutoDao() throws ClassNotFoundException {
        return new ProdutoDaoJDBC(DB.getConnection());
    }

    public static ProdutosGeraisDao createProdutosGeraisDao() throws ClassNotFoundException {
        return new ProdutosGeraisDaoJDBC(DB.getConnection());
    }
  
    public static RelatorioGeralDao createRelatorioGeralDao() throws ClassNotFoundException {
        return new RelatorioGeralDaoJDBC(DB.getConnection());
    }
   
    public static TransportadoraDao createTransportadoraDao() throws ClassNotFoundException {
        return new TransportadoraDaoJDBC(DB.getConnection());
    }
   
    
}
