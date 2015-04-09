package com.jivesoftware.services.model.jive;

import io.nodus.util.annotation.Descriptor;
import io.nodus.util.annotation.Selection;
import java.util.Date;

import static io.nodus.util.field.DescriptorType.TIMESTAMP;

/**
 * Created by erwolff on 4/2/15.
 */
public class List {

    private Long id;
    private Integer followerCount;
    private Integer likeCount;
    private Date published;
    private String[] tags;
    private Date updated;

    @Selection(values = {"jive-icon-document"})
    private String iconCss;

    private Place parentPlace;
    private Long contentID;
    private Person author;
    private Content content;
    private String parent;
    private Integer favoriteCount;
    private Integer replyCount;

    @Selection(values = {"published", "draft"})
    private String status;

    private String subject;
    private Integer viewCount;
    private boolean visibleToExternalContributors;
    private boolean parentVisible;
    private boolean parentContentVisible;

    @Descriptor(type = TIMESTAMP)
    private Long lastActivity;

    @Selection(values = {"open"})
    private String authorship;

    private String[] categories;

    @Selection(values = {"place"})
    private String visibility;

    private OutcomeType[] outcomeTypes;

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getAuthorship() {
        return authorship;
    }

    public void setAuthorship(String authorship) {
        this.authorship = authorship;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Long getContentID() {
        return contentID;
    }

    public void setContentID(Long contentID) {
        this.contentID = contentID;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public String getIconCss() {
        return iconCss;
    }

    public void setIconCss(String iconCss) {
        this.iconCss = iconCss;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(Long lastActivity) {
        this.lastActivity = lastActivity;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public OutcomeType[] getOutcomeTypes() {
        return outcomeTypes;
    }

    public void setOutcomeTypes(OutcomeType[] outcomeTypes) {
        this.outcomeTypes = outcomeTypes;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public boolean isParentContentVisible() {
        return parentContentVisible;
    }

    public void setParentContentVisible(boolean parentContentVisible) {
        this.parentContentVisible = parentContentVisible;
    }

    public Place getParentPlace() {
        return parentPlace;
    }

    public void setParentPlace(Place parentPlace) {
        this.parentPlace = parentPlace;
    }

    public boolean isParentVisible() {
        return parentVisible;
    }

    public void setParentVisible(boolean parentVisible) {
        this.parentVisible = parentVisible;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public boolean isVisibleToExternalContributors() {
        return visibleToExternalContributors;
    }

    public void setVisibleToExternalContributors(boolean visibleToExternalContributors) {
        this.visibleToExternalContributors = visibleToExternalContributors;
    }
}
