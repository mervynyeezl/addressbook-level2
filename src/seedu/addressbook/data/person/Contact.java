package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public abstract class Contact {

	public Contact(boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
	}
	
	private boolean isPrivate;
	public String value;
	
	@Override 
	public String toString() {
		return value;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	public boolean isPrivate() {
        return isPrivate;
    }
}
