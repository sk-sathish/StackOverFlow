package entity;

import java.util.List;
import java.util.Set;

public class Question extends CommentableContent {
	Set<Vote> votesToDelete;
	List<Answer> answerList;
	List<String> tags;
}
