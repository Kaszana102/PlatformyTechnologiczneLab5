import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

public class MageRepository {
    private Collection<Mage> collection;

    public MageRepository() {
        this.collection = new ArrayList<Mage>();
    }

    public Optional<Mage> find(String name) {
        return collection.stream().filter(mage -> mage.getName().equals(name)).findFirst();
    }
    public void delete(String name) throws Exception {
        boolean exists=false;
        Mage mage;
        Iterator<Mage> iterator = collection.iterator();
        while (iterator.hasNext()) {
            mage=iterator.next();
            if (mage.getName().equals(name)){
                exists=true;
                iterator.remove();
            }
        }

        if(!exists){
            throw new Exception("IllegalArgumentException");
        }
    }
    public void save(Mage mage) {
        collection.add(mage);
    }

}
