package entity;

import java.util.Set;

public abstract class Content {
	Member member;
	Set<Vote> upVotes;
	Set<Vote> downVotes;
	Set<Flag> flags;
}
