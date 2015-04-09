package com.jivesoftware.services.model.jive;

/**
 * Created by erwolff on 4/2/15.
 */
public class OutcomeType {

    private Long id;
    private String name;
    private boolean shareable;
    private boolean noteRequired;
    private boolean urlAllowed;
    private boolean generalNote;
    private boolean confirmExclusion;
    private boolean confirmUnmark;

    public boolean isConfirmExclusion() {
        return confirmExclusion;
    }

    public void setConfirmExclusion(boolean confirmExclusion) {
        this.confirmExclusion = confirmExclusion;
    }

    public boolean isConfirmUnmark() {
        return confirmUnmark;
    }

    public void setConfirmUnmark(boolean confirmUnmark) {
        this.confirmUnmark = confirmUnmark;
    }

    public boolean isGeneralNote() {
        return generalNote;
    }

    public void setGeneralNote(boolean generalNote) {
        this.generalNote = generalNote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNoteRequired() {
        return noteRequired;
    }

    public void setNoteRequired(boolean noteRequired) {
        this.noteRequired = noteRequired;
    }

    public boolean isShareable() {
        return shareable;
    }

    public void setShareable(boolean shareable) {
        this.shareable = shareable;
    }

    public boolean isUrlAllowed() {
        return urlAllowed;
    }

    public void setUrlAllowed(boolean urlAllowed) {
        this.urlAllowed = urlAllowed;
    }
}
