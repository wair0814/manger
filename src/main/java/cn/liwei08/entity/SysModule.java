package cn.liwei08.entity;

public class SysModule {
    private Integer moduleNo;

    private Integer moduleFatherNo;

    private String moduleName;

    private String modulePath;

    public Integer getModuleNo() {
        return moduleNo;
    }

    public void setModuleNo(Integer moduleNo) {
        this.moduleNo = moduleNo;
    }

    public Integer getModuleFatherNo() {
        return moduleFatherNo;
    }

    public void setModuleFatherNo(Integer moduleFatherNo) {
        this.moduleFatherNo = moduleFatherNo;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModulePath() {
        return modulePath;
    }

    public void setModulePath(String modulePath) {
        this.modulePath = modulePath;
    }
}