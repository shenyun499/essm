/*
//调试表原始对象
{
  "title" : "调试：com.intellij.database.psi.DbTableImpl",
  "methodList" : [ {
    "name" : "isTemporary",
    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isTemporary()",
    "value" : "false"
  }, {
    "name" : "isSystem",
    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isSystem()",
    "value" : "false"
  }, {
    "name" : "getColumnAttrs",
    "desc" : "public java.util.Set<com.intellij.database.model.DasColumn$Attribute> com.intellij.database.psi.DbTableImpl.getColumnAttrs(com.intellij.database.model.DasColumn)",
    "value" : null
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbTableImpl.getDocumentation()",
    "value" : "<html><body><b>Data Source:</b> essm@localhost<br><b>Schema:</b> essm<br><b>Table:</b> essm_word<br><br><font color=\"#7ec3e6\">-- 单词表</font><br><code><pre><font color=\"#7ec3e6\">-- auto-generated definition</font>\n<font color=\"#ed864a\">create</font> <font color=\"#ed864a\">table</font> essm_word\n(\n  id      <font color=\"#ed864a\">int</font>(<font color=\"#33ccff\"><b>12</b></font>) <font color=\"#ed864a\">auto_increment</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词编号，主键&#39;</font>\n    <font color=\"#ed864a\">primary</font> <font color=\"#ed864a\">key</font><font color=\"#ed864a\"><b>,</b></font>\n  pid     <font color=\"#ed864a\">int</font>(<font color=\"#33ccff\"><b>12</b></font>)    <font color=\"#ed864a\">not</font> <font color=\"#ed864a\">null</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;用户编号，外键，关联essm_user表的id&#39;</font><font color=\"#ed864a\"><b>,</b></font>\n  chinese <font color=\"#ed864a\">char</font>(<font color=\"#33ccff\"><b>30</b></font>)   <font color=\"#ed864a\">not</font> <font color=\"#ed864a\">null</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词中文&#39;</font><font color=\"#ed864a\"><b>,</b></font>\n  english <font color=\"#ed864a\">char</font>(<font color=\"#33ccff\"><b>30</b></font>)   <font color=\"#ed864a\">not</font> <font color=\"#ed864a\">null</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词英文&#39;</font><font color=\"#ed864a\"><b>,</b></font>\n  sign    <font color=\"#ed864a\">tinyint</font>(<font color=\"#33ccff\"><b>1</b></font>) <font color=\"#ed864a\">not</font> <font color=\"#ed864a\">null</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词状态位 1：已掌握 2：未掌握&#39;</font><font color=\"#ed864a\"><b>,</b></font>\n  <font color=\"#ed864a\">constraint</font> essm_word_ibfk_1\n    <font color=\"#ed864a\">foreign</font> <font color=\"#ed864a\">key</font> (pid) <font color=\"#ed864a\">references</font> essm_user (id)\n)\n  <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词表&#39;</font><font color=\"#ed864a\"><b>;</b></font>\n\n<font color=\"#ed864a\">create</font> <font color=\"#ed864a\">index</font> pid\n  <font color=\"#ed864a\">on</font> essm_word (pid)<font color=\"#ed864a\"><b>;</b></font></pre></code>"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbTableImpl.getDocumentation()",
    "value" : "<html><body><b>Data Source:</b> essm@localhost<br><b>Schema:</b> essm<br><b>Table:</b> essm_word<br><br><font color=\"#7ec3e6\">-- 单词表</font><br><code><pre><font color=\"#7ec3e6\">-- auto-generated definition</font>\n<font color=\"#ed864a\">create</font> <font color=\"#ed864a\">table</font> essm_word\n(\n  id      <font color=\"#ed864a\">int</font>(<font color=\"#33ccff\"><b>12</b></font>) <font color=\"#ed864a\">auto_increment</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词编号，主键&#39;</font>\n    <font color=\"#ed864a\">primary</font> <font color=\"#ed864a\">key</font><font color=\"#ed864a\"><b>,</b></font>\n  pid     <font color=\"#ed864a\">int</font>(<font color=\"#33ccff\"><b>12</b></font>)    <font color=\"#ed864a\">not</font> <font color=\"#ed864a\">null</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;用户编号，外键，关联essm_user表的id&#39;</font><font color=\"#ed864a\"><b>,</b></font>\n  chinese <font color=\"#ed864a\">char</font>(<font color=\"#33ccff\"><b>30</b></font>)   <font color=\"#ed864a\">not</font> <font color=\"#ed864a\">null</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词中文&#39;</font><font color=\"#ed864a\"><b>,</b></font>\n  english <font color=\"#ed864a\">char</font>(<font color=\"#33ccff\"><b>30</b></font>)   <font color=\"#ed864a\">not</font> <font color=\"#ed864a\">null</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词英文&#39;</font><font color=\"#ed864a\"><b>,</b></font>\n  sign    <font color=\"#ed864a\">tinyint</font>(<font color=\"#33ccff\"><b>1</b></font>) <font color=\"#ed864a\">not</font> <font color=\"#ed864a\">null</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词状态位 1：已掌握 2：未掌握&#39;</font><font color=\"#ed864a\"><b>,</b></font>\n  <font color=\"#ed864a\">constraint</font> essm_word_ibfk_1\n    <font color=\"#ed864a\">foreign</font> <font color=\"#ed864a\">key</font> (pid) <font color=\"#ed864a\">references</font> essm_user (id)\n)\n  <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词表&#39;</font><font color=\"#ed864a\"><b>;</b></font>\n\n<font color=\"#ed864a\">create</font> <font color=\"#ed864a\">index</font> pid\n  <font color=\"#ed864a\">on</font> essm_word (pid)<font color=\"#ed864a\"><b>;</b></font></pre></code>"
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
    "value" : "essm_word"
  }, {
    "name" : "getLanguage",
    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
    "value" : "Language: SQL"
  }, {
    "name" : "getTypeName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
    "value" : "table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "schema:essm"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "schema:essm"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "schema:essm"
  }, {
    "name" : "init",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "setName",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "isDirectory",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
    "value" : "false"
  }, {
    "name" : "getComment",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
    "value" : "单词表"
  }, {
    "name" : "isValid",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
    "value" : "true"
  }, {
    "name" : "getText",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
    "value" : "create table essm_word\n(\n  id      int(12) auto_increment comment '单词编号，主键'\n    primary key,\n  pid     int(12)    not null comment '用户编号，外键，关联essm_user表的id',\n  chinese char(30)   not null comment '单词中文',\n  english char(30)   not null comment '单词英文',\n  sign    tinyint(1) not null comment '单词状态位 1：已掌握 2：未掌握',\n  constraint essm_word_ibfk_1\n    foreign key (pid) references essm_user (id)\n)\n  comment '单词表';\n\ncreate index pid\n  on essm_word (pid);\n\n"
  }, {
    "name" : "getManager",
    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
    "value" : "com.intellij.psi.impl.PsiManagerImpl@79e23174"
  }, {
    "name" : "getPosition",
    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
    "value" : "0"
  }, {
    "name" : "getDeclaration",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
    "value" : "table:essm_word"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
    "value" : "Deferred. Base=Row icon. myIcons=[jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202018.3.5/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
    "value" : null
  }, {
    "name" : "isWritable",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
    "value" : "true"
  }, {
    "name" : "getWeight",
    "desc" : "public int com.intellij.database.psi.DbElementImpl.getWeight()",
    "value" : "10000"
  }, {
    "name" : "getDelegate",
    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
    "value" : "essm_word: table"
  }, {
    "name" : "getChildren",
    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
    "value" : "[Lcom.intellij.psi.PsiElement;@4e3f517"
  }, {
    "name" : "getProject",
    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
    "value" : "Project 'D:\\graduation_project\\essm' essm"
  }, {
    "name" : "isCaseSensitive",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
    "value" : "false"
  }, {
    "name" : "getKind",
    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
    "value" : "table"
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
    "value" : null
  }, {
    "name" : "canNavigate",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
    "value" : null
  }, {
    "name" : "canNavigateToSource",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
    "value" : null
  }, {
    "name" : "getDasParent",
    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "schema:essm"
  }, {
    "name" : "getDasParent",
    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "schema:essm"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "root:essm@localhost"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "root:essm@localhost"
  }, {
    "name" : "getDasChildren",
    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "checkSetName",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "acceptChildren",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "processChildren",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
    "value" : null
  }, {
    "name" : "getMetaData",
    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
    "value" : "table:essm_word"
  }, {
    "name" : "processDeclarations",
    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getVirtualFile",
    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
    "value" : "DB VirtualFile: table, essm.essm_word [essm@localhost] (Valid)"
  }, {
    "name" : "getLocationString",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
    "value" : "essm [essm@localhost]"
  }, {
    "name" : "getBaseIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
    "value" : "jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202018.3.5/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg"
  }, {
    "name" : "createDeclarationProcessor",
    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "newDeclarationProcessor",
    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getNode",
    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
    "value" : null
  }, {
    "name" : "getTextLength",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
    "value" : "0"
  }, {
    "name" : "getFirstChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
    "value" : null
  }, {
    "name" : "getLastChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
    "value" : null
  }, {
    "name" : "getNextSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
    "value" : null
  }, {
    "name" : "getTextOffset",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
    "value" : "0"
  }, {
    "name" : "getPrevSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
    "value" : null
  }, {
    "name" : "getPresentation",
    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
    "value" : "table:essm_word"
  }, {
    "name" : "findElementAt",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
    "value" : null
  }, {
    "name" : "textToCharArray",
    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
    "value" : null
  }, {
    "name" : "textContains",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
    "value" : null
  }, {
    "name" : "getTextRange",
    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
    "value" : null
  }, {
    "name" : "getPresentableText",
    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
    "value" : "essm_word"
  }, {
    "name" : "getStartOffsetInParent",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
    "value" : "0"
  }, {
    "name" : "isPhysical",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
    "value" : "false"
  }, {
    "name" : "add",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "checkDelete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "delete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "accept",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "getContext",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
    "value" : "schema:essm"
  }, {
    "name" : "copy",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
    "value" : null
  }, {
    "name" : "addRange",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReference",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
    "value" : null
  }, {
    "name" : "addBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getUseScope",
    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "getResolveScope",
    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "getReferences",
    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
    "value" : "[Lcom.intellij.psi.PsiReference;@22d2c0f8"
  }, {
    "name" : "deleteChildRange",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "findReferenceAt",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
    "value" : null
  }, {
    "name" : "isEquivalentTo",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "checkAdd",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getNavigationElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
    "value" : "table:essm_word"
  }, {
    "name" : "getOriginalElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
    "value" : "table:essm_word"
  }, {
    "name" : "getContainingFile",
    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
    "value" : null
  }, {
    "name" : "transformFlags",
    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
    "value" : null
  }, {
    "name" : "buildRowIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "isNativeFileType",
    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
    "value" : null
  }, {
    "name" : "overlayIcons",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
    "value" : null
  }, {
    "name" : "registerIconLayer",
    "desc" : "public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "iconWithVisibilityIfNeeded",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "createLayeredIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
    "value" : null
  }, {
    "name" : "getUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "getUserDataString",
    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@17ce1eb9, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@59d510d2, lastComputedIcon={0=Row icon. myIcons=[jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202018.3.5/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}}"
  }, {
    "name" : "getCopyableUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putCopyableUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "putUserDataIfAbsent",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "copyCopyableDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "putUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "copyUserDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "isUserDataEmpty",
    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
    "value" : "false"
  }, {
    "name" : "getTextRangeInParent",
    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
    "value" : "(0,0)"
  }, {
    "name" : "getDbParent",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
    "value" : "schema:essm"
  }, {
    "name" : "getDbChildren",
    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDependencies",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
    "value" : "[Ljava.lang.Object;@1a6e3d83"
  }, {
    "name" : "getDependences",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
    "value" : "[Ljava.lang.Object;@1a6e3d83"
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@5a1ea82a"
  }, {
    "name" : "WEIGHT_BASE",
    "type" : "int",
    "value" : "10000"
  }, {
    "name" : "WEIGHT_INC",
    "type" : "int",
    "value" : "1000"
  }, {
    "name" : "myParent",
    "type" : "com.intellij.database.psi.DbElement",
    "value" : "schema:essm"
  }, {
    "name" : "myDelegate",
    "type" : "java.lang.Object",
    "value" : "essm_word: table"
  }, {
    "name" : "myTransactionalVersion",
    "type" : "long",
    "value" : "19"
  }, {
    "name" : "ASYNC_DOC_CUT",
    "type" : "java.lang.String",
    "value" : "<!-- async-doc-cut -->"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@b99ae04"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@7b52672f"
  }, {
    "name" : "FLAGS_LOCKED",
    "type" : "int",
    "value" : "2048"
  }, {
    "name" : "ICON_COMPUTE",
    "type" : "com.intellij.util.NullableFunction",
    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$841/1052026382@72614b6e"
  }, {
    "name" : "VISIBILITY_ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$1@5d91f2f0"
  }, {
    "name" : "ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$2@1b3e9ec8"
  }, {
    "name" : "ourIconLayers",
    "type" : "java.util.List",
    "value" : "[com.intellij.psi.impl.ElementBase$IconLayer@73bde99f, com.intellij.psi.impl.ElementBase$IconLayer@b7ff6bd, com.intellij.psi.impl.ElementBase$IconLayer@59ab8350, com.intellij.psi.impl.ElementBase$IconLayer@368c8e73]"
  }, {
    "name" : "COPYABLE_USER_MAP_KEY",
    "type" : "com.intellij.openapi.util.Key",
    "value" : "COPYABLE_USER_MAP_KEY"
  }, {
    "name" : "myUserMap",
    "type" : "com.intellij.util.keyFMap.KeyFMap",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@17ce1eb9, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@59d510d2, lastComputedIcon={0=Row icon. myIcons=[jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202018.3.5/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}}"
  }, {
    "name" : "updater",
    "type" : "com.intellij.util.concurrency.AtomicFieldUpdater",
    "value" : "com.intellij.util.concurrency.AtomicFieldUpdater@2a61682c"
  } ]
}

//调试列原始对象
{
  "title" : "调试：com.intellij.database.psi.DbColumnImpl",
  "methodList" : [ {
    "name" : "getDefault",
    "desc" : "public java.lang.String com.intellij.database.psi.DbColumnImpl.getDefault()",
    "value" : null
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "table:essm_word"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "table:essm_word"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "table:essm_word"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "table:essm_word"
  }, {
    "name" : "getTable",
    "desc" : "public com.intellij.database.model.DasTable com.intellij.database.psi.DbColumnImpl.getTable()",
    "value" : "table:essm_word"
  }, {
    "name" : "getTable",
    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getTable()",
    "value" : "table:essm_word"
  }, {
    "name" : "getDataType",
    "desc" : "public com.intellij.database.model.DataType com.intellij.database.psi.DbColumnImpl.getDataType()",
    "value" : "int(12)"
  }, {
    "name" : "getWeight",
    "desc" : "public int com.intellij.database.psi.DbColumnImpl.getWeight()",
    "value" : "10030"
  }, {
    "name" : "getTableName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbColumnImpl.getTableName()",
    "value" : "essm_word"
  }, {
    "name" : "isNotNull",
    "desc" : "public boolean com.intellij.database.psi.DbColumnImpl.isNotNull()",
    "value" : "true"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbColumnImpl.getDocumentation()",
    "value" : "<html><body><b>Data Source:</b> essm@localhost<br><b>Schema:</b> essm<br><b>Table:</b> essm_word<br><b>Column:</b> id<br><br><font color=\"#7ec3e6\">-- 单词编号，主键</font><br><code><pre><font color=\"#ed864a\">alter</font> <font color=\"#ed864a\">table</font> essm_word\n  <font color=\"#ed864a\">add</font> id <font color=\"#ed864a\">int</font>(<font color=\"#33ccff\"><b>12</b></font>) <font color=\"#ed864a\">auto_increment</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词编号，主键&#39;</font><font color=\"#ed864a\"><b>;</b></font>\n\n</pre></code>"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbColumnImpl.getDocumentation()",
    "value" : "<html><body><b>Data Source:</b> essm@localhost<br><b>Schema:</b> essm<br><b>Table:</b> essm_word<br><b>Column:</b> id<br><br><font color=\"#7ec3e6\">-- 单词编号，主键</font><br><code><pre><font color=\"#ed864a\">alter</font> <font color=\"#ed864a\">table</font> essm_word\n  <font color=\"#ed864a\">add</font> id <font color=\"#ed864a\">int</font>(<font color=\"#33ccff\"><b>12</b></font>) <font color=\"#ed864a\">auto_increment</font> <font color=\"#ed864a\">comment</font> <font color=\"#54b33e\">&#39;单词编号，主键&#39;</font><font color=\"#ed864a\"><b>;</b></font>\n\n</pre></code>"
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
    "value" : "id"
  }, {
    "name" : "getLanguage",
    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
    "value" : "Language: SQL"
  }, {
    "name" : "getTypeName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
    "value" : "column"
  }, {
    "name" : "init",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "setName",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "isDirectory",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
    "value" : "false"
  }, {
    "name" : "getComment",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
    "value" : "单词编号，主键"
  }, {
    "name" : "isValid",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
    "value" : "true"
  }, {
    "name" : "getText",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
    "value" : "alter table essm_word\n  add id int(12) auto_increment comment '单词编号，主键';\n\n"
  }, {
    "name" : "getManager",
    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
    "value" : "com.intellij.psi.impl.PsiManagerImpl@79e23174"
  }, {
    "name" : "getPosition",
    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
    "value" : "1"
  }, {
    "name" : "getDeclaration",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
    "value" : "column:id"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
    "value" : "Deferred. Base=jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202018.3.5/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
    "value" : null
  }, {
    "name" : "isWritable",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
    "value" : "true"
  }, {
    "name" : "getDelegate",
    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
    "value" : "id: column"
  }, {
    "name" : "getChildren",
    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
    "value" : "[Lcom.intellij.psi.PsiElement;@4e3f517"
  }, {
    "name" : "getProject",
    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
    "value" : "Project 'D:\\graduation_project\\essm' essm"
  }, {
    "name" : "isCaseSensitive",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
    "value" : "false"
  }, {
    "name" : "getKind",
    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
    "value" : "column"
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
    "value" : null
  }, {
    "name" : "canNavigate",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
    "value" : null
  }, {
    "name" : "canNavigateToSource",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
    "value" : null
  }, {
    "name" : "getDasParent",
    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "table:essm_word"
  }, {
    "name" : "getDasParent",
    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "table:essm_word"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "root:essm@localhost"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "root:essm@localhost"
  }, {
    "name" : "getDasChildren",
    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "checkSetName",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "acceptChildren",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "processChildren",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
    "value" : null
  }, {
    "name" : "getMetaData",
    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
    "value" : "column:id"
  }, {
    "name" : "processDeclarations",
    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getVirtualFile",
    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
    "value" : "DB VirtualFile: column, essm.essm_word.id [essm@localhost] (Valid)"
  }, {
    "name" : "getLocationString",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
    "value" : "essm.essm_word [essm@localhost]"
  }, {
    "name" : "getBaseIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
    "value" : "jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202018.3.5/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
  }, {
    "name" : "createDeclarationProcessor",
    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "newDeclarationProcessor",
    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getNode",
    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
    "value" : null
  }, {
    "name" : "getTextLength",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
    "value" : "0"
  }, {
    "name" : "getFirstChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
    "value" : null
  }, {
    "name" : "getLastChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
    "value" : null
  }, {
    "name" : "getNextSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
    "value" : null
  }, {
    "name" : "getTextOffset",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
    "value" : "0"
  }, {
    "name" : "getPrevSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
    "value" : null
  }, {
    "name" : "getPresentation",
    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
    "value" : "column:id"
  }, {
    "name" : "findElementAt",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
    "value" : null
  }, {
    "name" : "textToCharArray",
    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
    "value" : null
  }, {
    "name" : "textContains",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
    "value" : null
  }, {
    "name" : "getTextRange",
    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
    "value" : null
  }, {
    "name" : "getPresentableText",
    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
    "value" : "id"
  }, {
    "name" : "getStartOffsetInParent",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
    "value" : "0"
  }, {
    "name" : "isPhysical",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
    "value" : "false"
  }, {
    "name" : "add",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "checkDelete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "delete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "accept",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "getContext",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
    "value" : "table:essm_word"
  }, {
    "name" : "copy",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
    "value" : null
  }, {
    "name" : "addRange",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReference",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
    "value" : null
  }, {
    "name" : "addBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getUseScope",
    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "getResolveScope",
    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "getReferences",
    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
    "value" : "[Lcom.intellij.psi.PsiReference;@22d2c0f8"
  }, {
    "name" : "deleteChildRange",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "findReferenceAt",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
    "value" : null
  }, {
    "name" : "isEquivalentTo",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "checkAdd",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getNavigationElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
    "value" : "column:id"
  }, {
    "name" : "getOriginalElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
    "value" : "column:id"
  }, {
    "name" : "getContainingFile",
    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
    "value" : null
  }, {
    "name" : "transformFlags",
    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
    "value" : null
  }, {
    "name" : "buildRowIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "isNativeFileType",
    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
    "value" : null
  }, {
    "name" : "overlayIcons",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
    "value" : null
  }, {
    "name" : "registerIconLayer",
    "desc" : "public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "iconWithVisibilityIfNeeded",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "createLayeredIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
    "value" : null
  }, {
    "name" : "getUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "getUserDataString",
    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5df8e16f}"
  }, {
    "name" : "getCopyableUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putCopyableUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "putUserDataIfAbsent",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "copyCopyableDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "putUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "copyUserDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "isUserDataEmpty",
    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
    "value" : "false"
  }, {
    "name" : "getTextRangeInParent",
    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
    "value" : "(0,0)"
  }, {
    "name" : "getDbParent",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
    "value" : "table:essm_word"
  }, {
    "name" : "getDbChildren",
    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDependencies",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
    "value" : "[Ljava.lang.Object;@1a6e3d83"
  }, {
    "name" : "getDependences",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
    "value" : "[Ljava.lang.Object;@1a6e3d83"
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@5a1ea82a"
  }, {
    "name" : "WEIGHT_BASE",
    "type" : "int",
    "value" : "10000"
  }, {
    "name" : "WEIGHT_INC",
    "type" : "int",
    "value" : "1000"
  }, {
    "name" : "myParent",
    "type" : "com.intellij.database.psi.DbElement",
    "value" : "table:essm_word"
  }, {
    "name" : "myDelegate",
    "type" : "java.lang.Object",
    "value" : "id: column"
  }, {
    "name" : "myTransactionalVersion",
    "type" : "long",
    "value" : "19"
  }, {
    "name" : "ASYNC_DOC_CUT",
    "type" : "java.lang.String",
    "value" : "<!-- async-doc-cut -->"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@b99ae04"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@7b52672f"
  }, {
    "name" : "FLAGS_LOCKED",
    "type" : "int",
    "value" : "2048"
  }, {
    "name" : "ICON_COMPUTE",
    "type" : "com.intellij.util.NullableFunction",
    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$841/1052026382@72614b6e"
  }, {
    "name" : "VISIBILITY_ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$1@5d91f2f0"
  }, {
    "name" : "ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$2@1b3e9ec8"
  }, {
    "name" : "ourIconLayers",
    "type" : "java.util.List",
    "value" : "[com.intellij.psi.impl.ElementBase$IconLayer@73bde99f, com.intellij.psi.impl.ElementBase$IconLayer@b7ff6bd, com.intellij.psi.impl.ElementBase$IconLayer@59ab8350, com.intellij.psi.impl.ElementBase$IconLayer@368c8e73]"
  }, {
    "name" : "COPYABLE_USER_MAP_KEY",
    "type" : "com.intellij.openapi.util.Key",
    "value" : "COPYABLE_USER_MAP_KEY"
  }, {
    "name" : "myUserMap",
    "type" : "com.intellij.util.keyFMap.KeyFMap",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5df8e16f}"
  }, {
    "name" : "updater",
    "type" : "com.intellij.util.concurrency.AtomicFieldUpdater",
    "value" : "com.intellij.util.concurrency.AtomicFieldUpdater@2a61682c"
  } ]
}

//调试列原始列类型
{
  "title" : "调试：com.intellij.database.model.DataType",
  "methodList" : [ {
    "name" : "getLength",
    "desc" : "public int com.intellij.database.model.DataType.getLength()",
    "value" : "12"
  }, {
    "name" : "getScale",
    "desc" : "public int com.intellij.database.model.DataType.getScale()",
    "value" : "0"
  }, {
    "name" : "getPrecision",
    "desc" : "public int com.intellij.database.model.DataType.getPrecision()",
    "value" : "12"
  }, {
    "name" : "getSpecification",
    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification()",
    "value" : "int(12)"
  }, {
    "name" : "getSpecification",
    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification(boolean,boolean)",
    "value" : null
  }, {
    "name" : "equalsWithoutJdbc",
    "desc" : "public boolean com.intellij.database.model.DataType.equalsWithoutJdbc(com.intellij.database.model.DataType)",
    "value" : null
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "MAX_SIZE",
    "type" : "int",
    "value" : "2147483647"
  }, {
    "name" : "STAR_SIZE",
    "type" : "int",
    "value" : "2147483646"
  }, {
    "name" : "NO_SIZE",
    "type" : "int",
    "value" : "-1"
  }, {
    "name" : "NO_SCALE",
    "type" : "int",
    "value" : "0"
  }, {
    "name" : "UNKNOWN",
    "type" : "com.intellij.database.model.DataType",
    "value" : "unknown"
  }, {
    "name" : "schemaName",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "packageName",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "typeName",
    "type" : "java.lang.String",
    "value" : "int"
  }, {
    "name" : "size",
    "type" : "int",
    "value" : "12"
  }, {
    "name" : "scale",
    "type" : "int",
    "value" : "0"
  }, {
    "name" : "sizeUnit",
    "type" : "com.intellij.database.model.LengthUnit",
    "value" : "com.intellij.database.model.LengthUnit@57ba8210"
  }, {
    "name" : "vagueArg",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "suffix",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "sizeUnitExplicit",
    "type" : "boolean",
    "value" : "false"
  }, {
    "name" : "custom",
    "type" : "boolean",
    "value" : "false"
  }, {
    "name" : "enumValues",
    "type" : "java.util.List",
    "value" : null
  }, {
    "name" : "jdbcType",
    "type" : "int",
    "value" : "0"
  } ]
}

//获取原始列类型中的字段
sqlType = int

//执行原始列类型中的方法
sqlTypeLen = 12*/
