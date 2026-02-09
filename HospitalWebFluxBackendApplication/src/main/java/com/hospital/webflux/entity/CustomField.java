package com.hospital.webflux.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("custom_fields")
public class CustomField {

    @Id
    private Long id;

    private String labelName;
    private String dataType;
    private String helpText;
    private String externalField;
    private String externalService;

    private Boolean attachmentImage;
    private Boolean attachmentPdf;
    private Boolean attachmentDocument;
    private Boolean attachmentAll;

    private String lookupModule;
    private String autoPrefix;
    private String autoStart;
    private String autoSuffix;
    private Boolean autoApplyToExisting;

    private String colorPlacement;
    private Boolean pii;
    private Boolean ephi;

    private String preventDuplicate;
    private String inputFormat;
    private String defaultValue;
    private String inheritFrom;
    private String mandatory;
    private String showInPdf;

    private LocalDateTime createdAt;

    // ===== GETTERS & SETTERS =====

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLabelName() { return labelName; }
    public void setLabelName(String labelName) { this.labelName = labelName; }

    public String getDataType() { return dataType; }
    public void setDataType(String dataType) { this.dataType = dataType; }

    public String getHelpText() { return helpText; }
    public void setHelpText(String helpText) { this.helpText = helpText; }

    public String getExternalField() { return externalField; }
    public void setExternalField(String externalField) { this.externalField = externalField; }

    public String getExternalService() { return externalService; }
    public void setExternalService(String externalService) { this.externalService = externalService; }

    public Boolean getAttachmentImage() { return attachmentImage; }
    public void setAttachmentImage(Boolean attachmentImage) { this.attachmentImage = attachmentImage; }

    public Boolean getAttachmentPdf() { return attachmentPdf; }
    public void setAttachmentPdf(Boolean attachmentPdf) { this.attachmentPdf = attachmentPdf; }

    public Boolean getAttachmentDocument() { return attachmentDocument; }
    public void setAttachmentDocument(Boolean attachmentDocument) { this.attachmentDocument = attachmentDocument; }

    public Boolean getAttachmentAll() { return attachmentAll; }
    public void setAttachmentAll(Boolean attachmentAll) { this.attachmentAll = attachmentAll; }

    public String getLookupModule() { return lookupModule; }
    public void setLookupModule(String lookupModule) { this.lookupModule = lookupModule; }

    public String getAutoPrefix() { return autoPrefix; }
    public void setAutoPrefix(String autoPrefix) { this.autoPrefix = autoPrefix; }

    public String getAutoStart() { return autoStart; }
    public void setAutoStart(String autoStart) { this.autoStart = autoStart; }

    public String getAutoSuffix() { return autoSuffix; }
    public void setAutoSuffix(String autoSuffix) { this.autoSuffix = autoSuffix; }

    public Boolean getAutoApplyToExisting() { return autoApplyToExisting; }
    public void setAutoApplyToExisting(Boolean autoApplyToExisting) { this.autoApplyToExisting = autoApplyToExisting; }

    public String getColorPlacement() { return colorPlacement; }
    public void setColorPlacement(String colorPlacement) { this.colorPlacement = colorPlacement; }

    public Boolean getPii() { return pii; }
    public void setPii(Boolean pii) { this.pii = pii; }

    public Boolean getEphi() { return ephi; }
    public void setEphi(Boolean ephi) { this.ephi = ephi; }

    public String getPreventDuplicate() { return preventDuplicate; }
    public void setPreventDuplicate(String preventDuplicate) { this.preventDuplicate = preventDuplicate; }

    public String getInputFormat() { return inputFormat; }
    public void setInputFormat(String inputFormat) { this.inputFormat = inputFormat; }

    public String getDefaultValue() { return defaultValue; }
    public void setDefaultValue(String defaultValue) { this.defaultValue = defaultValue; }

    public String getInheritFrom() { return inheritFrom; }
    public void setInheritFrom(String inheritFrom) { this.inheritFrom = inheritFrom; }

    public String getMandatory() { return mandatory; }
    public void setMandatory(String mandatory) { this.mandatory = mandatory; }

    public String getShowInPdf() { return showInPdf; }
    public void setShowInPdf(String showInPdf) { this.showInPdf = showInPdf; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
