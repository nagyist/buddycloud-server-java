package org.buddycloud.channelserver.channel.node.configuration.field;

public class Factory
{	
	
	public Field create(String type, String value)
    {
    	if ((null == type) || (null == value)) {
    		throw new ConfigurationFieldException();
    	}
    	if (type.equals(Creator.FIELD_NAME)) {
    		Creator field = new Creator();
    	    setValue(field, value);
    	    return field;
    	} else if (type.equals(ChannelTitle.FIELD_NAME)) {
    	    ChannelTitle field = new ChannelTitle();
    	    setValue(field, value);
    	    return field;
    	} else if (type.equals(ChannelDescription.FIELD_NAME)) {
    		ChannelDescription field = new ChannelDescription();
    		setValue(field, value);
    		return field;
    	} else if (type.equals(AccessModel.FIELD_NAME)) {
    		AccessModel field = new AccessModel();
    		setValue(field, value);
    		return field;
    	} else if (type.equals(Affiliation.FIELD_NAME)) {
    		Affiliation field = new Affiliation();
    		setValue(field, value);
    		return field;
    	} else if (type.equals(CreationDate.FIELD_NAME)) {
    		CreationDate field = new CreationDate();
    		setValue(field, value);
    		return field;
    	} else if (type.equals(LastUpdatedDate.FIELD_NAME)) {
    		LastUpdatedDate field = new LastUpdatedDate();
    		setValue(field, value);
    		return field;
    	} else if (type.equals(ChannelType.FIELD_NAME)) {
    		ChannelType field = new ChannelType();
    		setValue(field, value);
    	    return field;
    	} else {
    		Generic field = new Generic();
    	    field.setName(type);
    	    field.setValue(value);
    	    return field;
    	}
    }

	private void setValue(Field field, String value) {
		if (0 == value.length()) {
			value = field.DEFAULT_VALUE;
		}
		field.setValue(value);
	}
}