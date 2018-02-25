package tree.control;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tree.core.Node;
import tree.core.Tree;
import tree.dao.TreeDao;

@RestController
public class NodeController {

	@RequestMapping(value="node/{treeId}", method = RequestMethod.POST)
	public void addNode(@PathVariable String treeId, @RequestParam("label") String label, @RequestParam("nodeId") String id ) {
		UUID treeUuid = UUID.fromString(treeId);
		Tree tree = TreeDao.getInstance().select(treeUuid);
		UUID nodeUuid = UUID.fromString(id);
		Node nodeToAdd = new Node(label);
		if(treeUuid.equals(nodeUuid)) {
			tree.addRoot(nodeToAdd);
		}else {
			Node node = tree.findNode(nodeUuid);
			node.addNode(nodeToAdd);
		}
	}
	
	
}
