/**
 * Convert user roles to LabelValue objects for convenience.
 * @return a list of LabelValue objects with role information
 */
//Source file
@Transient
public List<LabelValue> getRoleList(){
    List<LabelValue> userRoles = new ArrayList<LabelValue>();

    if (this.roles != null) {
        for (Role role : roles) {
            // convert the user's roles to LabelValue Objects
            userRoles.add(new LabelValue(role.getName(), role.getName()));
        }
    }

    return userRoles;
}

//Synthesized Code
@Transient
public List<LabelValue> getRoleList()
{
    List<LabelValue> list = new ArrayList<LabelValue>();

    if (this.roles != null)
    {
        for (Role role : roles)
        {
            // convert the user's roles to LabelValue Objects
            list.add(new LabelValue(role.getName(), role.getName()));
        }
    }

    return list;
}