package view;

import classe.Documento;
import classe.Ferramenta;
import classe.Ontologia;
import controle.AnotacaoControle;
import controle.ClassTree;
import controle.DocumentoControle;
import controle.FerramentaControle;
import controle.ModularizacaoControle;
import controle.OntologiaControle;
import controle.PoliticaModControle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class TelaAnotacao extends javax.swing.JFrame {

    public static String doc_id = "";
    public static String ont_id = "";
    public static String termosel = "";
    public static String classesel = "";
    public ClassTree tree;
    public JTree arvore;
    protected DefaultTreeModel treeModel = null;
    protected TreeSelectionModel selectionModel = null;
    private ArrayList docsel = new ArrayList();
    private ArrayList semente = new ArrayList();
    private ArrayList termosrel = new ArrayList();
    private File arq = null;

    /** Creates new form TelaAnotacao */
    public TelaAnotacao() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        a = new javax.swing.JScrollPane();
        buscarMod = new javax.swing.JButton();
        btnCarregaM = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnanotar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        txtOntologia = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        btnOntologia = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        nm_modulo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Document Annotation");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Document Annotation"));
        jPanel3.setPreferredSize(new java.awt.Dimension(175, 379));

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        buscarMod.setText("View Modules");
        buscarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarModActionPerformed(evt);
            }
        });

        btnCarregaM.setText("Generate Modules");
        btnCarregaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregaMActionPerformed(evt);
            }
        });

        jLabel3.setText("Ontology/Module");

        jLabel4.setText("Document");

        btnanotar.setText("Note");
        btnanotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanotarActionPerformed(evt);
            }
        });

        JTextArea1.setColumns(20);
        JTextArea1.setLineWrap(true);
        JTextArea1.setRows(30);
        JTextArea1.setWrapStyleWord(true);
        JTextArea1.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        JTextArea1.setSelectionColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(JTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnanotar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCarregaM)))
                            .addComponent(jLabel4)))
                    .addComponent(buscarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCarregaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnanotar))
                    .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(buscarMod)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose the files"));

        btnOntologia.setText("Load Ontology");
        btnOntologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOntologiaActionPerformed(evt);
            }
        });

        btnDoc.setText("Load Document");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtOntologia, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOntologia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(nm_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoc)
                    .addComponent(nm_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOntologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOntologia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Choose the files"); // NOI18N

        setSize(new java.awt.Dimension(851, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOntologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOntologiaActionPerformed
        OntologiaControle onto = new OntologiaControle();
        FerramentaControle ferr = new FerramentaControle();
        Ferramenta ferramenta = null;
        Ontologia ontologia = null;
        //Buscar caminho configurado na ferramenta
        ferramenta = ferr.buscar();
        JFileChooser file = new JFileChooser(new File(ferramenta.getRepositorio_ontologia()));
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setDialogTitle("Selecione uma ontologia do repositório");
        file.getComponent(0).setVisible(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Ontologias", "owl", "rdf");  //Cria um filtro  
        file.setFileFilter(filter);  //Altera o filtro do JFileChooser 
        int i = file.showSaveDialog(null);
        if (i == 1) {
            txtOntologia.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            txtOntologia.setText(arquivo.getPath());
            //txtnm_arq.setText(arquivo.getName());
            String caminho = arquivo.getPath();
            File arq_sel = new File(caminho);
            long tamanho = arq_sel.length();
            //verificar id da ontologia
            ontologia = onto.buscarOntologia(arquivo.getName());
            ont_id = Integer.toString(ontologia.getId());
            semente.clear();
            try {
                //"http://www.co-ode.org/ontologies/pizza/2007/02/12/pizza.owl"

                tree = new ClassTree(txtOntologia.getText());
                arvore = tree.getJTree();
                int mode = TreeSelectionModel.SINGLE_TREE_SELECTION;
                selectionModel = new DefaultTreeSelectionModel();
                selectionModel.setSelectionMode(mode);
                arvore.setSelectionModel(selectionModel);
                a.setViewportView(arvore);

            } catch (Exception ex) {
                Logger.getLogger(TelaAnotacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnOntologiaActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        //Escolher documento do repositório
        FerramentaControle ferr = new FerramentaControle();
        Ferramenta ferramenta = null;
        DocumentoControle doc = new DocumentoControle();
        Documento documento = null;
        PoliticaModControle pol = new PoliticaModControle();

        //Buscar caminho configurado na ferramenta
        ferramenta = ferr.buscar();
        //System.out.println("Rep doc" + ferramenta.getRepositorio_doc());
        JFileChooser file = new JFileChooser(new File(ferramenta.getRepositorio_doc()));
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setDialogTitle("Selecione um documento do repositório");
        file.getComponent(0).setVisible(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Documentos", "txt", "doc");  //Cria um filtro  
        file.setFileFilter(filter);  //Altera o filtro do JFileChooser 
        int i = file.showSaveDialog(null);
        if (i == 1) {
            txtDocumento.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            txtDocumento.setText(arquivo.getPath());
            String caminho = arquivo.getPath();
            File arq_sel = new File(caminho);
            long tamanho = arq_sel.length();
            //verificar id do documento
            documento = doc.buscarDocumento(arquivo.getName());
            doc_id = documento.getId().toString();
            //Exibir arquivo no objeto
            arq = file.getSelectedFile();
            JTextArea1.setText("");
            docsel = new ArrayList();
            //Leitura do arquivo selecionado
            try {
                lerDoc(arq);
                //abrir página de politica de modularização
                TelaPoliticaMod p = new TelaPoliticaMod();
                p.setVisible(true);
                semente.clear();
            } catch (IOException iOException) {
                Logger.getLogger(TelaAnotacao.class.getName()).log(Level.SEVERE, null, iOException);
            }
        }
    }//GEN-LAST:event_btnDocActionPerformed

    private void lerDoc(File arq) throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new FileReader(arq));
        String str, texto = "";
        while ((str = in.readLine()) != null) {
            texto += str + System.getProperty("line.separator");;
        }
        JTextArea1.setText(texto);
        in.close();
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        nm_modulo.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void btnanotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanotarActionPerformed
        //Recuperar termo da ontologia selecionado
        DefaultMutableTreeNode noSelecionado;
        TreePath caminho = arvore.getSelectionPath();
        noSelecionado = (DefaultMutableTreeNode) caminho.getLastPathComponent();
        //JOptionPane.showMessageDialog(null, noSelecionado);
        DefaultMutableTreeNode noNaCaixa = noSelecionado;
        if (!JTextArea1.getSelectedText().equals("") || noNaCaixa.toString().equals("")) {
            //Extrair texto até encontrar #
            int lastDot = noNaCaixa.toString().lastIndexOf("#");
            String classe = noNaCaixa.toString().substring(lastDot, noNaCaixa.toString().length());
            classe = classe.replace("#", "");
            classe = classe.replace("]", "");
            classesel = classe;
            //Recuperar termo do documento selecionado
            String termo = JTextArea1.getSelectedText();
            JTextArea1.replaceSelection("<<" + termo + ">>");
            termosel = termo;
            //Identificar linha onde o texto anotado foi encontrado
            // obtém todas as linhas de texto do JTextArea
            //Pego o parágrafo
            StringTokenizer st = new StringTokenizer(JTextArea1.getText(), "\n");
            while (st.hasMoreTokens()) {
                docsel.add(st.nextToken());
            }
            AnotacaoControle ac = new AnotacaoControle();
            termosrel = ac.identifica_relevantes(docsel);

            semente.add(classe);
            semente.add(termo);
            try {
                lerDoc(arq);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(TelaAnotacao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TelaAnotacao.class.getName()).log(Level.SEVERE, null, ex);
            }
            //abrir página de anotacao
            TelaAnota ta = new TelaAnota();
            ta.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar o termo e a classe para realizar a anotação.");
        }
    }//GEN-LAST:event_btnanotarActionPerformed

    private void btnCarregaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregaMActionPerformed
        ArrayList res_semente = new ArrayList();
        Set<String> set = new HashSet<String>(semente);
        for (String val : set) {
            res_semente.add(val);
        }
        ArrayList res_termosrel = new ArrayList();
        Set<String> set1 = new HashSet<String>(termosrel);
        for (String val : set1) {
            res_termosrel.add(val);
        }

        //Verificar todas as ontologias do banco diferentes da que o usuário escolheu como base
        OntologiaControle oc = new OntologiaControle();
        ArrayList buscarOntologias = oc.buscarOntologias();

        for (int i = 0; i < buscarOntologias.size(); i++) {
            if (!buscarOntologias.get(i).toString().equals(ont_id)) {
                //gerar módulo
                String ont_mod = buscarOntologias.get(i).toString();
                ModularizacaoControle mod = new ModularizacaoControle();
                //Buscar caminho da ontologia e montar nome_modulo
                Ontologia o = oc.buscarOntologiaPorId(Integer.parseInt(ont_mod));
                String modulo = "m_" + doc_id + "_" + o.getNome_ontologia();
                mod.extrairModulo(ont_id, o.getCaminho_fisico(), res_semente, res_termosrel, modulo);
            }
        }

    }//GEN-LAST:event_btnCarregaMActionPerformed

    private void buscarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarModActionPerformed
        OntologiaControle onto = new OntologiaControle();
        FerramentaControle ferr = new FerramentaControle();
        Ferramenta ferramenta = null;
        Ontologia ontologia = null;
        //Buscar caminho configurado na ferramenta
        ferramenta = ferr.buscar();
        JFileChooser file = new JFileChooser(new File(ferramenta.getRepositorio_ontologia()));
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setDialogTitle("Selecione um módulo gerado");

        file.getComponent(0).setVisible(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Módulos das Ontologias", "owl");  //Cria um filtro  
        file.setFileFilter(filter);  //Altera o filtro do JFileChooser 
        int i = file.showSaveDialog(null);
        if (i == 1) {
            JOptionPane.showMessageDialog(null, "Módulo da Ontologia não selecionado.");
        } else {
            File arquivo = file.getSelectedFile();
            if (!arquivo.getName().startsWith("m_" + doc_id + "_")) {
                JOptionPane.showMessageDialog(null, "Módulo da Ontologia selecionado não é pertinente ao documento.");
            } else {
                String ontcam = arquivo.getPath();
                //verificar id da ontologia
                ontologia = onto.buscarOntologia(arquivo.getName());
                ont_id = Integer.toString(ontologia.getId());
                try {
                    //"http://www.co-ode.org/ontologies/pizza/2007/02/12/pizza.owl"
                    tree = new ClassTree(ontcam);
                    arvore = tree.getJTree();
                    int mode = TreeSelectionModel.SINGLE_TREE_SELECTION;
                    selectionModel = new DefaultTreeSelectionModel();
                    selectionModel.setSelectionMode(mode);
                    arvore.setSelectionModel(selectionModel);
                    a.setViewportView(arvore);
                } catch (Exception ex) {
                    Logger.getLogger(TelaAnotacao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_buscarModActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaAnotacao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTextArea1;
    private javax.swing.JScrollPane a;
    private javax.swing.JButton btnCarregaM;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnOntologia;
    private javax.swing.JButton btnanotar;
    private javax.swing.JButton buscarMod;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nm_modulo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtOntologia;
    // End of variables declaration//GEN-END:variables
}
