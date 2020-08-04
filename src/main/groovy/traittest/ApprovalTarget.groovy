package traittest

trait ApprovalTarget <D extends ApprovalDraft> {

    Date approved
    Date approvalStarted

    abstract List<D> getDrafts()
}