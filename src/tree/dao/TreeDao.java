package tree.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import tree.core.Tree;

public class TreeDao {
	
	private static TreeDao singleton;
	
	private Map<UUID,Tree> datas;
	
	
	
	private TreeDao() {
		datas = new HashMap<>();
	}
	
	public static TreeDao getInstance() {
		if(singleton == null) {
			initSingleton();
		}
		return singleton;
	}
	
	private static void initSingleton() {
		singleton = new TreeDao();
	}
	
	public Tree select(UUID id) {
		return datas.get(id);
	}
	
	public void insert(Tree tree) {
		datas.put(tree.getUuid(), tree);
	}
	
	public void delete(UUID id) {
		datas.remove(id);
	}
	
	public List<Tree> selectAll(){
		return new ArrayList<>(datas.values());
	}

}
