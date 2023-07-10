package entity;
import java.util.Objects;

import constants.FlagType;
public class Flag {
	Member member;
	FlagType type;
	private Content forContent;
	String description;
	public Flag() {

	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Flag)) {
			return false;
		}
		Flag flag = (Flag)obj;
		if(this.member==flag.member && forContent==flag.forContent) {
			return true;
		}
		return false;
	}
	public int hashCode() {
		return Objects.hash(this, forContent);
	}
}
