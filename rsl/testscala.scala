import org.eclipse.jdt.core.dom.ASTNode

val proj = RSWorkspace.project("Ex0")

val cls1 = proj.pkg("p").classes.select(By.Name("Game1")).first
val mhd1 = cls1.method("startGame").first
val ifStmt1 = mhd1.body.statements.findByKind(ASTNode.IF_STATEMENT)

val cls2 = proj.pkg("p").classes.select(By.Name("Game2")).first
val mhd2 = cls2.method("startGame").first
val ifStmt2 = mhd2.body.statements.findByKind(ASTNode.IF_STATEMENT)

ifStmt1.extractMethod("extracted")
ifStmt2.extractMethod("extracted")

val mExtr1 = cls1.method("extracted").first
val ms = new RSCollection(Array(mExtr1, mhd1, mhd2))
ms.pullUp(cls2.superclass)