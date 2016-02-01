package uclaorg.uclagroup.initiatecase;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Case implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CASE_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "CASE_ID_GENERATOR", sequenceName = "CASE_ID_SEQ")
   private java.lang.Long id;

   private java.lang.Integer caseId;

   private java.lang.String caseAppointeeName;

   private java.lang.String reason;

   private java.lang.Boolean isCaseInitiated;

   public Case()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.Integer getCaseId()
   {
      return this.caseId;
   }

   public void setCaseId(java.lang.Integer caseId)
   {
      this.caseId = caseId;
   }

   public java.lang.String getCaseAppointeeName()
   {
      return this.caseAppointeeName;
   }

   public void setCaseAppointeeName(java.lang.String caseAppointeeName)
   {
      this.caseAppointeeName = caseAppointeeName;
   }

   public java.lang.String getReason()
   {
      return this.reason;
   }

   public void setReason(java.lang.String reason)
   {
      this.reason = reason;
   }

   public java.lang.Boolean getIsCaseInitiated()
   {
      return this.isCaseInitiated;
   }

   public void setIsCaseInitiated(java.lang.Boolean isCaseInitiated)
   {
      this.isCaseInitiated = isCaseInitiated;
   }

   public Case(java.lang.Long id, java.lang.Integer caseId,
         java.lang.String caseAppointeeName, java.lang.String reason,
         java.lang.Boolean isCaseInitiated)
   {
      this.id = id;
      this.caseId = caseId;
      this.caseAppointeeName = caseAppointeeName;
      this.reason = reason;
      this.isCaseInitiated = isCaseInitiated;
   }

}