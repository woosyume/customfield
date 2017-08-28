package net.atlassian.woohyeok.plguins.customfield;

import com.atlassian.jira.issue.customfields.impl.GenericTextCFType;
import com.atlassian.jira.issue.customfields.manager.GenericConfigManager;
import com.atlassian.jira.issue.customfields.persistence.CustomFieldValuePersister;
import com.atlassian.jira.issue.fields.TextFieldCharacterLengthValidator;
import com.atlassian.jira.security.JiraAuthenticationContext;

/**
 * Created by kim.woohyeok on 2017/08/28.
 */
public class JiraCustomField extends GenericTextCFType {

    protected JiraCustomField(CustomFieldValuePersister customFieldValuePersister, GenericConfigManager genericConfigManager, TextFieldCharacterLengthValidator textFieldCharacterLengthValidator, JiraAuthenticationContext jiraAuthenticationContext) {
        super(customFieldValuePersister, genericConfigManager, textFieldCharacterLengthValidator, jiraAuthenticationContext);
    }
}
