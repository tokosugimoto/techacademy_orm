package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.bytebuddy.asm.Advice.Return;

public class DBUtil {
    private static final String PERSISTENCE_UNIT_NAME = "techacademy_orm";
    private static EntityManagerFactory emf;
    
    public static EntityManager createEntityManager();
        Return getEntityManagerFactory().createEntityManager();
    }

    private static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        
        return emf;
    }

}

