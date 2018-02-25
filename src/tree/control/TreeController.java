package tree.control;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tree.core.Tree;
import tree.dao.TreeDao;

@RestController
public class TreeController {
	
	@RequestMapping(value = "/tree/{id}", method = RequestMethod.GET)
	public Tree getTree(@PathVariable String id ) {
		UUID uuid = UUID.fromString(id);
		return TreeDao.getInstance().select(uuid);
	}
	
	
	
	@RequestMapping(value = "/tree", method = RequestMethod.POST)
	public Tree createTree(@RequestParam("name") String name  ) {
		Tree tree = new Tree(name);
		TreeDao.getInstance().insert(tree);
		return tree;
	}
	
	
	@RequestMapping(value = "/tree/{id}", method = RequestMethod.DELETE)
	public void deleteTree(@PathVariable String id ) {
		UUID uuid = UUID.fromString(id);
		TreeDao.getInstance().delete(uuid);
	}
	

}
