package ar.com.durango95.canilla.bo;

/**
 * Models an USENET message according to RFC 1036.
 * 
 * @author dromoli
 */
public class Article implements Cloneable {

    // required headers
    private String from; // RFC 1036: From
    private String date; // RFC 1036: Date
    private String newsgroups; // RFC 1036: Newsgroups
    private String subject; // RFC 1036: Subject
    private String messageId; // RFC 1036: Message-ID
    private String path; // RFC 1036: Path

    // optional headers
    private String replyTo; // RFC 1036: Reply-To
    private String sender; // RFC 1036: Sender
    private String followupTo; // RFC 1036: Followup-To
    private String expires; // RFC 1036: Expires
    private String references; // RFC 1036: References
    private String control; // RFC 1036: Control
    private String distribution; // RFC 1036: Distribution
    private String organization; // RFC 1036: Organization
    private String keywords; // RFC 1036: Keywords
    private String summary; // RFC 1036: Summary
    private String approved; // RFC 1036: Approved
    private String lines; // RFC 1036: Lines
    private String xref; // RFC 1036: Xref

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getFollowupTo() {
        return followupTo;
    }

    public void setFollowupTo(String followupTo) {
        this.followupTo = followupTo;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getNewsgroups() {
        return newsgroups;
    }

    public void setNewsgroups(String newsgroups) {
        this.newsgroups = newsgroups;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getXref() {
        return xref;
    }

    public void setXref(String xref) {
        this.xref = xref;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("ARTICLE:");
        sb.append("\r\n\tFrom: ");
        sb.append(from);
        sb.append("\r\n\tDate: ");
        sb.append(date);
        sb.append("\r\n\tNewsgroups:");
        sb.append(newsgroups);
        sb.append("\r\n\tSubject:");
        sb.append(subject);
        sb.append("\r\n\tMessage-ID:");
        sb.append(messageId);
        sb.append("\r\n\tPath:");
        sb.append(path);
        sb.append("\r\n\tReply-To:");
        sb.append(replyTo);
        sb.append("\r\n\tSender:");
        sb.append(sender);
        sb.append("\r\n\tFollowup-To:");
        sb.append(followupTo);
        sb.append("\r\n\tExpires:");
        sb.append(expires);
        sb.append("\r\n\tReferences:");
        sb.append(references);
        sb.append("\r\n\tControl:");
        sb.append(control);
        sb.append("\r\n\tDistribution:");
        sb.append(distribution);
        sb.append("\r\n\tOrganization:");
        sb.append(organization);
        sb.append("\r\n\tKeywords:");
        sb.append(keywords);
        sb.append("\r\n\tSummary:");
        sb.append(summary);
        sb.append("\r\n\tApproved:");
        sb.append(approved);
        sb.append("\r\n\tLines:");
        sb.append(lines);
        sb.append("\r\n\tXref:");
        sb.append(xref);
        return sb.toString();
    }
    
    public Object clone() throws CloneNotSupportedException {
        Article cloned = (Article)super.clone();
        cloned.setFrom(from);
        cloned.setDate(date);
        cloned.setNewsgroups(newsgroups);
        cloned.setSubject(subject);
        cloned.setMessageId(messageId);
        cloned.setPath(path);
        cloned.setReplyTo(replyTo);
        cloned.setSender(sender);
        cloned.setFollowupTo(followupTo);
        cloned.setExpires(expires);
        cloned.setReferences(references);
        cloned.setControl(control);
        cloned.setDistribution(distribution);
        cloned.setOrganization(organization);
        cloned.setKeywords(keywords);
        cloned.setSummary(summary);
        cloned.setApproved(approved);
        cloned.setLines(lines);
        cloned.setXref(xref);
        
        return cloned;
        
    }
    
}