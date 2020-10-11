package blog.userfunction.sdk.builders;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.api.BranchApi;
import blog.userfunction.sdk.model.Branch;

import java.util.Date;
import java.util.UUID;

public class BranchBuilder {

    Branch builtObject;

    public BranchBuilder() {
        builtObject = new Branch();
    }

    public BranchBuilder withDefaults() {
        withItemIdentifier(UUID.randomUUID().toString());
        return this;
    }

    public Branch getBranch() {
        return builtObject;
    }

    public BranchBuilder withItemIdentifier(String inItem) {
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public BranchBuilder withEffectiveDate(Date inItem) {
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public BranchBuilder withExpirationDate(Date inItem) {
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public BranchBuilder withCreateTime(Date inItem) {
        builtObject.setCreateTime(inItem);
        return this;
    }

    public BranchBuilder withUpdateTime(Date inItem) {
        builtObject.setUpdateTime(inItem);
        return this;
    }

    public BranchBuilder withCode(String inItem) {
        builtObject.setCode(inItem);
        return this;
    }

    public BranchBuilder withLocked(boolean inItem) {
        builtObject.setLocked(inItem);
        return this;
    }

    public BranchBuilder withName(String inItem) {
        builtObject.setName(inItem);
        return this;
    }

    public BranchBuilder withBranchType(Branch.BranchTypeEnum inItem){
        builtObject.setBranchType(inItem);
        return this;
    }

    public Branch update() {
        BranchApi api = new ApiClient().buildClient(BranchApi.class);
        return api.branchCreate(builtObject);
    }
}
