package traittest

class Contract implements ApprovalTarget<ContractDraft>{

    static constraints = {
    }

    @Override
    List<ContractDraft> getDrafts() {
        []
    }
}
