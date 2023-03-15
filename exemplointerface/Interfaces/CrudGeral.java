
package exemplointerface.Interfaces;

import java.util.List;

public interface CrudGeral {
    
    public Object inserir(Object obj);
    public Object alterar(Object obj);
    public Object excluir(Object obj);
    public Object buscar(Object obj);
    public List<Object>listar(Object obj);
    
}
