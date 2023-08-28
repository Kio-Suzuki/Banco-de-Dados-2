package com.mycompany.p2;

import com.mycompany.p2.model.dao.BackupPedidoDao;
import com.mycompany.p2.model.dao.CategoriaDao;
import com.mycompany.p2.model.entities.Categoria;
import com.mycompany.p2.model.entities.Transportadora;
import com.mycompany.p2.model.dao.DaoFactory;
import com.mycompany.p2.model.dao.ClienteDao;
import com.mycompany.p2.model.dao.PedidoDao;
import com.mycompany.p2.model.dao.ProdutoDao;
import com.mycompany.p2.model.dao.ProdutosGeraisDao;
import com.mycompany.p2.model.dao.RelatorioGeralDao;
import com.mycompany.p2.model.dao.TransportadoraDao;
import com.mycompany.p2.model.entities.BackupPedido;
import com.mycompany.p2.model.entities.Cliente;
import com.mycompany.p2.model.entities.Pedido;
import com.mycompany.p2.model.entities.Produto;
import com.mycompany.p2.model.entities.ProdutosGerais;
import com.mycompany.p2.model.entities.RelatorioGeral;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Main extends javax.swing.JFrame {

    public Main() {
        
        Locale locale = new Locale("pt", "BR");
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPrincipal = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanelSUP = new javax.swing.JPanel();
        jPanelDIR = new javax.swing.JPanel();
        jPanelESQ = new javax.swing.JPanel();
        jPanelINF = new javax.swing.JPanel();
        JLabStatus = new javax.swing.JLabel();
        btBackup = new javax.swing.JLabel();
        btViewCliente = new javax.swing.JLabel();
        btRelatorio = new javax.swing.JLabel();
        iconPostgresql = new javax.swing.JLabel();
        btTransportadora = new javax.swing.JLabel();
        btHome = new javax.swing.JLabel();
        btClientes = new javax.swing.JLabel();
        btPedido = new javax.swing.JLabel();
        btEstoque = new javax.swing.JLabel();
        iconUsuario = new javax.swing.JLabel();
        jLabUsuario = new javax.swing.JLabel();
        iconHome = new javax.swing.JLabel();
        iconClientes = new javax.swing.JLabel();
        iconVendas = new javax.swing.JLabel();
        iconEstoque = new javax.swing.JLabel();
        iconTransportes = new javax.swing.JLabel();
        janelas = new javax.swing.JTabbedPane();
        guiaHome = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        guiaClientes = new javax.swing.JTabbedPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        menu1 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabClientes = new javax.swing.JTable();
        btCadastrarCliente = new javax.swing.JButton();
        btDeletarCliente = new javax.swing.JButton();
        jLabNome1 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabSobrenome1 = new javax.swing.JLabel();
        jLabLogin1 = new javax.swing.JLabel();
        jLabSenha1 = new javax.swing.JLabel();
        jLabEmail1 = new javax.swing.JLabel();
        jLabNumero1 = new javax.swing.JLabel();
        jLabCep1 = new javax.swing.JLabel();
        jLabRua1 = new javax.swing.JLabel();
        jLabCidade1 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        cxClienteNome = new javax.swing.JTextField();
        cxClienteSobrenome = new javax.swing.JTextField();
        cxClienteLogin = new javax.swing.JTextField();
        cxClienteSenha = new javax.swing.JTextField();
        cxClienteEmail = new javax.swing.JTextField();
        cxClienteRua = new javax.swing.JTextField();
        cxClienteNumero = new javax.swing.JTextField();
        cxClienteCidade = new javax.swing.JTextField();
        cxClienteCep = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        guiaPedidos = new javax.swing.JTabbedPane();
        menu2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabPedidos = new javax.swing.JTable();
        btCadastrarPedido = new javax.swing.JButton();
        btDeletarPedido = new javax.swing.JButton();
        btUpdatarPedido = new javax.swing.JButton();
        jLabPedido = new javax.swing.JLabel();
        jLabProdutoID = new javax.swing.JLabel();
        jLabQuantidadeP = new javax.swing.JLabel();
        jLabPrecoP = new javax.swing.JLabel();
        jLabClienteID = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        cxPedId = new javax.swing.JTextField();
        cxPedProdutoID = new javax.swing.JTextField();
        cxPedQuantidade = new javax.swing.JTextField();
        cxPedTranspId = new javax.swing.JTextField();
        cxPedClienteId = new javax.swing.JTextField();
        guiaEstoques = new javax.swing.JTabbedPane();
        menu3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabProdutos = new javax.swing.JTable();
        btCadastrarEstoque = new javax.swing.JButton();
        btDeletarEstoque = new javax.swing.JButton();
        jLabProduto = new javax.swing.JLabel();
        jLabQuantidade = new javax.swing.JLabel();
        jLabCategoria = new javax.swing.JLabel();
        jLabPreco = new javax.swing.JLabel();
        cxProdNome = new javax.swing.JTextField();
        cxProdAnoFabricacao = new javax.swing.JTextField();
        cxProdFabricante = new javax.swing.JTextField();
        cxProdPreco = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        btIrFabricante = new javax.swing.JLabel();
        guiaTransportadoras = new javax.swing.JTabbedPane();
        menu4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabTransportadora = new javax.swing.JTable();
        btCadastrar3 = new javax.swing.JButton();
        btDeletar3 = new javax.swing.JButton();
        jLabTransportadora = new javax.swing.JLabel();
        jLabCnpj = new javax.swing.JLabel();
        jLabTelefone = new javax.swing.JLabel();
        jLabTransEmail = new javax.swing.JLabel();
        cxTranspEmail = new javax.swing.JTextField();
        cxTranspNome = new javax.swing.JTextField();
        cxTranspCnpj = new javax.swing.JTextField();
        cxTranspTel = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        guiaBackup = new javax.swing.JTabbedPane();
        menu5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabBackupVendas = new javax.swing.JTable();
        guiaViewCliente = new javax.swing.JTabbedPane();
        jLabProdutoE = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabView = new javax.swing.JTable();
        jLabProduto1 = new javax.swing.JLabel();
        cxEstoqueProd = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        jLabQuantidade1 = new javax.swing.JLabel();
        cxEstoqueQuant = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        jLabPreco1 = new javax.swing.JLabel();
        cxEstoquePreco = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        cxEstoqueCateg = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        jLabCategoria2 = new javax.swing.JLabel();
        btCadastrarViewUsuario = new javax.swing.JButton();
        guiaViewRelatorio = new javax.swing.JTabbedPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabRelatorioGeral = new javax.swing.JTable();
        guiaFabricante = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabFabricante = new javax.swing.JLabel();
        cxCategoriaNome = new javax.swing.JTextField();
        jSeparator39 = new javax.swing.JSeparator();
        jScrollPane12 = new javax.swing.JScrollPane();
        tabFabricante = new javax.swing.JTable();
        btCadastrarFab = new javax.swing.JButton();
        btDeletarFab = new javax.swing.JButton();
        btIrIate = new javax.swing.JLabel();
        ONoFF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("E-COMMERCE");
        setResizable(false);

        MenuPrincipal.setBackground(new java.awt.Color(231, 228, 228));
        MenuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        MenuPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 20, 510));
        MenuPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 1100, 20));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        MenuPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 20, 510));

        jPanelSUP.setBackground(new java.awt.Color(231, 228, 228));

        javax.swing.GroupLayout jPanelSUPLayout = new javax.swing.GroupLayout(jPanelSUP);
        jPanelSUP.setLayout(jPanelSUPLayout);
        jPanelSUPLayout.setHorizontalGroup(
            jPanelSUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelSUPLayout.setVerticalGroup(
            jPanelSUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuPrincipal.add(jPanelSUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 820, 80));

        jPanelDIR.setBackground(new java.awt.Color(231, 228, 228));

        javax.swing.GroupLayout jPanelDIRLayout = new javax.swing.GroupLayout(jPanelDIR);
        jPanelDIR.setLayout(jPanelDIRLayout);
        jPanelDIRLayout.setHorizontalGroup(
            jPanelDIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelDIRLayout.setVerticalGroup(
            jPanelDIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuPrincipal.add(jPanelDIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, 20, 550));

        jPanelESQ.setBackground(new java.awt.Color(231, 228, 228));

        javax.swing.GroupLayout jPanelESQLayout = new javax.swing.GroupLayout(jPanelESQ);
        jPanelESQ.setLayout(jPanelESQLayout);
        jPanelESQLayout.setHorizontalGroup(
            jPanelESQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelESQLayout.setVerticalGroup(
            jPanelESQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuPrincipal.add(jPanelESQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jPanelINF.setBackground(new java.awt.Color(231, 228, 228));

        javax.swing.GroupLayout jPanelINFLayout = new javax.swing.GroupLayout(jPanelINF);
        jPanelINF.setLayout(jPanelINFLayout);
        jPanelINFLayout.setHorizontalGroup(
            jPanelINFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelINFLayout.setVerticalGroup(
            jPanelINFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuPrincipal.add(jPanelINF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, -1, 60));

        JLabStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabStatus.setText("Status:");
        MenuPrincipal.add(JLabStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, -1, -1));

        btBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btBackup.png"))); // NOI18N
        btBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBackupMouseClicked(evt);
            }
        });
        MenuPrincipal.add(btBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 400, -1, 70));

        btViewCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btEstoque.png"))); // NOI18N
        btViewCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btViewClienteMouseClicked(evt);
            }
        });
        MenuPrincipal.add(btViewCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, -1, 70));

        btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btRelGeral.png"))); // NOI18N
        btRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRelatorioMouseClicked(evt);
            }
        });
        MenuPrincipal.add(btRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, -1, 80));

        iconPostgresql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo postgres.png"))); // NOI18N
        MenuPrincipal.add(iconPostgresql, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 190, -1));

        btTransportadora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btTransportadora.setForeground(new java.awt.Color(102, 102, 102));
        btTransportadora.setText("Transportadoras");
        btTransportadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTransportadoraMouseClicked(evt);
            }
        });
        MenuPrincipal.add(btTransportadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        btHome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btHome.setForeground(new java.awt.Color(102, 102, 102));
        btHome.setText("Home");
        btHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHomeMouseClicked(evt);
            }
        });
        MenuPrincipal.add(btHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        btClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btClientes.setForeground(new java.awt.Color(102, 102, 102));
        btClientes.setText("Clientes");
        btClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btClientesMouseClicked(evt);
            }
        });
        MenuPrincipal.add(btClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        btPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btPedido.setForeground(new java.awt.Color(102, 102, 102));
        btPedido.setText("Pedido");
        btPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPedidoMouseClicked(evt);
            }
        });
        MenuPrincipal.add(btPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        btEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btEstoque.setForeground(new java.awt.Color(102, 102, 102));
        btEstoque.setText("Iates");
        btEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEstoqueMouseClicked(evt);
            }
        });
        MenuPrincipal.add(btEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser.png"))); // NOI18N
        MenuPrincipal.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 50));
        MenuPrincipal.add(jLabUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        iconHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHome.png"))); // NOI18N
        MenuPrincipal.add(iconHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 40, 50));

        iconClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCliente.png"))); // NOI18N
        MenuPrincipal.add(iconClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        iconVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconVendas.png"))); // NOI18N
        iconVendas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MenuPrincipal.add(iconVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 20, 40));

        iconEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconIate2.png"))); // NOI18N
        MenuPrincipal.add(iconEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 30));

        iconTransportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTransporte.png"))); // NOI18N
        MenuPrincipal.add(iconTransportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 40, 30));

        janelas.setBackground(new java.awt.Color(231, 228, 228));

        home.setBackground(new java.awt.Color(231, 228, 228));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        guiaHome.addTab("tab1", home);

        janelas.addTab("Home", guiaHome);

        menu1.setBackground(new java.awt.Color(231, 228, 228));
        menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu1.setMinimumSize(new java.awt.Dimension(900, 500));
        menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        tabClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "SOBRENOME", "LOGIN", "SENHA", "E-MAIL", "RUA", "NÚMERO", "CIDADE", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabClientes.setRowHeight(30);
        tabClientes.setShowGrid(false);
        tabClientes.setShowHorizontalLines(true);
        jScrollPane11.setViewportView(tabClientes);
        if (tabClientes.getColumnModel().getColumnCount() > 0) {
            tabClientes.getColumnModel().getColumn(0).setResizable(false);
            tabClientes.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabClientes.getColumnModel().getColumn(1).setResizable(false);
            tabClientes.getColumnModel().getColumn(1).setPreferredWidth(350);
            tabClientes.getColumnModel().getColumn(2).setResizable(false);
            tabClientes.getColumnModel().getColumn(2).setPreferredWidth(350);
            tabClientes.getColumnModel().getColumn(3).setResizable(false);
            tabClientes.getColumnModel().getColumn(3).setPreferredWidth(300);
            tabClientes.getColumnModel().getColumn(4).setResizable(false);
            tabClientes.getColumnModel().getColumn(4).setPreferredWidth(300);
            tabClientes.getColumnModel().getColumn(5).setResizable(false);
            tabClientes.getColumnModel().getColumn(5).setPreferredWidth(500);
            tabClientes.getColumnModel().getColumn(6).setResizable(false);
            tabClientes.getColumnModel().getColumn(6).setPreferredWidth(500);
            tabClientes.getColumnModel().getColumn(7).setResizable(false);
            tabClientes.getColumnModel().getColumn(7).setPreferredWidth(150);
            tabClientes.getColumnModel().getColumn(8).setResizable(false);
            tabClientes.getColumnModel().getColumn(8).setPreferredWidth(350);
            tabClientes.getColumnModel().getColumn(9).setResizable(false);
            tabClientes.getColumnModel().getColumn(9).setPreferredWidth(300);
        }

        menu1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 880, 210));

        btCadastrarCliente.setText("Cadastrar");
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });
        menu1.add(btCadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        btDeletarCliente.setText("Deletar");
        btDeletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarClienteActionPerformed(evt);
            }
        });
        menu1.add(btDeletarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        jLabNome1.setText("NOME");
        menu1.add(jLabNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        menu1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 200, 10));

        jLabSobrenome1.setText("SOBRENOME");
        menu1.add(jLabSobrenome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabLogin1.setText("LOGIN");
        menu1.add(jLabLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabSenha1.setText("SENHA");
        menu1.add(jLabSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabEmail1.setText("EMAIL");
        menu1.add(jLabEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabNumero1.setText("NÚMERO");
        menu1.add(jLabNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabCep1.setText("CEP");
        menu1.add(jLabCep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabRua1.setText("RUA");
        menu1.add(jLabRua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabCidade1.setText("CIDADE");
        menu1.add(jLabCidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        menu1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 150, 10));

        cxClienteNome.setBackground(new java.awt.Color(231, 228, 228));
        cxClienteNome.setBorder(null);
        cxClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClienteNomeActionPerformed(evt);
            }
        });
        menu1.add(cxClienteNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 210, -1));

        cxClienteSobrenome.setBackground(new java.awt.Color(231, 228, 228));
        cxClienteSobrenome.setBorder(null);
        menu1.add(cxClienteSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 180, -1));

        cxClienteLogin.setBackground(new java.awt.Color(231, 228, 228));
        cxClienteLogin.setBorder(null);
        cxClienteLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClienteLoginActionPerformed(evt);
            }
        });
        menu1.add(cxClienteLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 210, -1));

        cxClienteSenha.setBackground(new java.awt.Color(231, 228, 228));
        cxClienteSenha.setBorder(null);
        cxClienteSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClienteSenhaActionPerformed(evt);
            }
        });
        menu1.add(cxClienteSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 200, -1));

        cxClienteEmail.setBackground(new java.awt.Color(231, 228, 228));
        cxClienteEmail.setBorder(null);
        cxClienteEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClienteEmailActionPerformed(evt);
            }
        });
        menu1.add(cxClienteEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 210, -1));

        cxClienteRua.setBackground(new java.awt.Color(231, 228, 228));
        cxClienteRua.setBorder(null);
        cxClienteRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClienteRuaActionPerformed(evt);
            }
        });
        menu1.add(cxClienteRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 210, -1));

        cxClienteNumero.setBackground(new java.awt.Color(231, 228, 228));
        cxClienteNumero.setBorder(null);
        cxClienteNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClienteNumeroActionPerformed(evt);
            }
        });
        menu1.add(cxClienteNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 160, -1));

        cxClienteCidade.setBackground(new java.awt.Color(231, 228, 228));
        cxClienteCidade.setBorder(null);
        cxClienteCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClienteCidadeActionPerformed(evt);
            }
        });
        menu1.add(cxClienteCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 210, -1));

        cxClienteCep.setBackground(new java.awt.Color(231, 228, 228));
        cxClienteCep.setBorder(null);
        cxClienteCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClienteCepActionPerformed(evt);
            }
        });
        menu1.add(cxClienteCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 160, -1));
        menu1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 210, 10));
        menu1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 200, 10));
        menu1.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, 10));
        menu1.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, 10));
        menu1.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 150, 10));
        menu1.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 210, 10));
        menu1.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 210, 10));

        jScrollPane7.setViewportView(menu1);

        guiaClientes.addTab("tab1", jScrollPane7);

        janelas.addTab("Clientes", guiaClientes);

        menu2.setBackground(new java.awt.Color(231, 228, 228));
        menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PEDIDO", "ID PRODUTO", "QUANTIDADE", "TRANSPORTADORA ID", "ID CLIENTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPedidos.setRowHeight(30);
        tabPedidos.setShowGrid(false);
        tabPedidos.setShowHorizontalLines(true);
        jScrollPane2.setViewportView(tabPedidos);
        if (tabPedidos.getColumnModel().getColumnCount() > 0) {
            tabPedidos.getColumnModel().getColumn(0).setResizable(false);
            tabPedidos.getColumnModel().getColumn(1).setResizable(false);
            tabPedidos.getColumnModel().getColumn(2).setResizable(false);
            tabPedidos.getColumnModel().getColumn(3).setResizable(false);
            tabPedidos.getColumnModel().getColumn(4).setResizable(false);
        }

        menu2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 690, 210));

        btCadastrarPedido.setText("Cadastrar");
        btCadastrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarPedidoActionPerformed(evt);
            }
        });
        menu2.add(btCadastrarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        btDeletarPedido.setText("Deletar");
        btDeletarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarPedidoActionPerformed(evt);
            }
        });
        menu2.add(btDeletarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        btUpdatarPedido.setText("Atualizar");
        btUpdatarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdatarPedidoActionPerformed(evt);
            }
        });
        menu2.add(btUpdatarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jLabPedido.setText("ID PEDIDO");
        menu2.add(jLabPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabProdutoID.setText("ID PRODUTO");
        menu2.add(jLabProdutoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabQuantidadeP.setText("QUANTIDADE");
        menu2.add(jLabQuantidadeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jLabPrecoP.setText("TRANSP ID");
        menu2.add(jLabPrecoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabClienteID.setText("ID CLIENTE");
        menu2.add(jLabClienteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));
        menu2.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 90, 10));
        menu2.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 80, 10));
        menu2.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 90, 10));
        menu2.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, 10));
        menu2.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 90, 10));

        cxPedId.setBackground(new java.awt.Color(231, 228, 228));
        cxPedId.setBorder(null);
        menu2.add(cxPedId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 90, -1));

        cxPedProdutoID.setBackground(new java.awt.Color(231, 228, 228));
        cxPedProdutoID.setBorder(null);
        menu2.add(cxPedProdutoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 80, -1));

        cxPedQuantidade.setBackground(new java.awt.Color(231, 228, 228));
        cxPedQuantidade.setBorder(null);
        cxPedQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPedQuantidadeActionPerformed(evt);
            }
        });
        menu2.add(cxPedQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 80, -1));

        cxPedTranspId.setBackground(new java.awt.Color(231, 228, 228));
        cxPedTranspId.setBorder(null);
        menu2.add(cxPedTranspId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, -1));

        cxPedClienteId.setBackground(new java.awt.Color(231, 228, 228));
        cxPedClienteId.setBorder(null);
        menu2.add(cxPedClienteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 80, -1));

        guiaPedidos.addTab("tab1", menu2);

        janelas.addTab("Pedido", guiaPedidos);

        menu3.setBackground(new java.awt.Color(231, 228, 228));
        menu3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO ID", "NOME", "FABRICANTE ID", "FABRICAÇÃO", "PREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabProdutos.setRowHeight(30);
        tabProdutos.setShowGrid(false);
        tabProdutos.setShowHorizontalLines(true);
        tabProdutos.getTableHeader().setResizingAllowed(false);
        tabProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabProdutos);
        if (tabProdutos.getColumnModel().getColumnCount() > 0) {
            tabProdutos.getColumnModel().getColumn(0).setResizable(false);
            tabProdutos.getColumnModel().getColumn(0).setPreferredWidth(180);
            tabProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabProdutos.getColumnModel().getColumn(1).setPreferredWidth(800);
            tabProdutos.getColumnModel().getColumn(2).setResizable(false);
            tabProdutos.getColumnModel().getColumn(2).setPreferredWidth(220);
            tabProdutos.getColumnModel().getColumn(3).setResizable(false);
            tabProdutos.getColumnModel().getColumn(3).setPreferredWidth(180);
            tabProdutos.getColumnModel().getColumn(4).setResizable(false);
            tabProdutos.getColumnModel().getColumn(4).setPreferredWidth(250);
        }

        menu3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 700, 210));

        btCadastrarEstoque.setText("Cadastrar");
        btCadastrarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarEstoqueActionPerformed(evt);
            }
        });
        menu3.add(btCadastrarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        btDeletarEstoque.setText("Deletar");
        btDeletarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarEstoqueActionPerformed(evt);
            }
        });
        menu3.add(btDeletarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabProduto.setText("PRODUTO");
        menu3.add(jLabProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabQuantidade.setText("FABRICAÇÃO");
        menu3.add(jLabQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabCategoria.setText("FABRICANTE");
        menu3.add(jLabCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabPreco.setText("PREÇO");
        menu3.add(jLabPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        cxProdNome.setBackground(new java.awt.Color(231, 228, 228));
        cxProdNome.setBorder(null);
        menu3.add(cxProdNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 190, -1));

        cxProdAnoFabricacao.setBackground(new java.awt.Color(231, 228, 228));
        cxProdAnoFabricacao.setBorder(null);
        cxProdAnoFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxProdAnoFabricacaoActionPerformed(evt);
            }
        });
        menu3.add(cxProdAnoFabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 180, -1));

        cxProdFabricante.setBackground(new java.awt.Color(231, 228, 228));
        cxProdFabricante.setBorder(null);
        cxProdFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxProdFabricanteActionPerformed(evt);
            }
        });
        menu3.add(cxProdFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 190, -1));

        cxProdPreco.setBackground(new java.awt.Color(231, 228, 228));
        cxProdPreco.setBorder(null);
        menu3.add(cxProdPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 180, -1));
        menu3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, 10));
        menu3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 190, 10));
        menu3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 200, 10));
        menu3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 190, 10));

        btIrFabricante.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btIrFabricante.setText("ir para Fabricante");
        btIrFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btIrFabricanteMouseClicked(evt);
            }
        });
        menu3.add(btIrFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        guiaEstoques.addTab("tab1", menu3);

        janelas.addTab("Iate", guiaEstoques);

        menu4.setBackground(new java.awt.Color(231, 228, 228));
        menu4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabTransportadora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CNPJ", "TELEFONE", "E-MAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabTransportadora.setRowHeight(30);
        tabTransportadora.setShowGrid(false);
        tabTransportadora.setShowHorizontalLines(true);
        jScrollPane4.setViewportView(tabTransportadora);
        if (tabTransportadora.getColumnModel().getColumnCount() > 0) {
            tabTransportadora.getColumnModel().getColumn(0).setResizable(false);
            tabTransportadora.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabTransportadora.getColumnModel().getColumn(1).setResizable(false);
            tabTransportadora.getColumnModel().getColumn(1).setPreferredWidth(600);
            tabTransportadora.getColumnModel().getColumn(2).setResizable(false);
            tabTransportadora.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabTransportadora.getColumnModel().getColumn(3).setResizable(false);
            tabTransportadora.getColumnModel().getColumn(3).setPreferredWidth(300);
            tabTransportadora.getColumnModel().getColumn(4).setResizable(false);
            tabTransportadora.getColumnModel().getColumn(4).setPreferredWidth(500);
        }

        menu4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 700, 210));

        btCadastrar3.setText("Cadastrar");
        btCadastrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrar3ActionPerformed(evt);
            }
        });
        menu4.add(btCadastrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        btDeletar3.setText("Deletar");
        btDeletar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletar3ActionPerformed(evt);
            }
        });
        menu4.add(btDeletar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabTransportadora.setText("NOME");
        menu4.add(jLabTransportadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabCnpj.setText("CNPJ");
        menu4.add(jLabCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabTelefone.setText("TELEFONE");
        menu4.add(jLabTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabTransEmail.setText("E-MAIL");
        menu4.add(jLabTransEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        cxTranspEmail.setBackground(new java.awt.Color(231, 228, 228));
        cxTranspEmail.setBorder(null);
        menu4.add(cxTranspEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 210, -1));

        cxTranspNome.setBackground(new java.awt.Color(231, 228, 228));
        cxTranspNome.setBorder(null);
        menu4.add(cxTranspNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 210, -1));

        cxTranspCnpj.setBackground(new java.awt.Color(231, 228, 228));
        cxTranspCnpj.setBorder(null);
        menu4.add(cxTranspCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 210, -1));

        cxTranspTel.setBackground(new java.awt.Color(231, 228, 228));
        cxTranspTel.setBorder(null);
        menu4.add(cxTranspTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 210, -1));
        menu4.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 210, 10));
        menu4.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, 10));
        menu4.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, 10));
        menu4.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 210, 10));

        guiaTransportadoras.addTab("tab1", menu4);

        janelas.addTab("Transportadora", guiaTransportadoras);

        menu5.setBackground(new java.awt.Color(231, 228, 228));
        menu5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabBackupVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PEDIDO", "QUANTIDADE", "ID PRODUTO", "ID TRANSPORTADORA", "ID CLIENTE", "DATA DA EXCLUSÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabBackupVendas.setRowHeight(30);
        tabBackupVendas.setShowHorizontalLines(true);
        tabBackupVendas.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabBackupVendas);
        if (tabBackupVendas.getColumnModel().getColumnCount() > 0) {
            tabBackupVendas.getColumnModel().getColumn(0).setResizable(false);
            tabBackupVendas.getColumnModel().getColumn(1).setResizable(false);
            tabBackupVendas.getColumnModel().getColumn(2).setResizable(false);
            tabBackupVendas.getColumnModel().getColumn(3).setResizable(false);
            tabBackupVendas.getColumnModel().getColumn(4).setResizable(false);
            tabBackupVendas.getColumnModel().getColumn(5).setResizable(false);
        }

        menu5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 700, 210));

        guiaBackup.addTab("tab1", menu5);

        janelas.addTab("Backup", guiaBackup);

        jLabProdutoE.setBackground(new java.awt.Color(231, 228, 228));
        jLabProdutoE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CATEGORIA", "ID PRODUTO", "FABRICACAO", "NOME", "PRECO", "CATEGORIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabView.setRowHeight(30);
        tabView.setShowGrid(false);
        tabView.setShowHorizontalLines(true);
        tabView.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tabView);
        if (tabView.getColumnModel().getColumnCount() > 0) {
            tabView.getColumnModel().getColumn(0).setResizable(false);
            tabView.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabView.getColumnModel().getColumn(1).setResizable(false);
            tabView.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabView.getColumnModel().getColumn(2).setResizable(false);
            tabView.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabView.getColumnModel().getColumn(3).setResizable(false);
            tabView.getColumnModel().getColumn(3).setPreferredWidth(500);
            tabView.getColumnModel().getColumn(4).setResizable(false);
            tabView.getColumnModel().getColumn(4).setPreferredWidth(200);
            tabView.getColumnModel().getColumn(5).setResizable(false);
            tabView.getColumnModel().getColumn(5).setPreferredWidth(400);
        }

        jLabProdutoE.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 710, 210));

        jLabProduto1.setText("PRODUTO");
        jLabProdutoE.add(jLabProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        cxEstoqueProd.setBackground(new java.awt.Color(231, 228, 228));
        cxEstoqueProd.setBorder(null);
        jLabProdutoE.add(cxEstoqueProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 190, -1));
        jLabProdutoE.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 200, 10));

        jLabQuantidade1.setText("QUANTIDADE");
        jLabProdutoE.add(jLabQuantidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        cxEstoqueQuant.setBackground(new java.awt.Color(231, 228, 228));
        cxEstoqueQuant.setBorder(null);
        jLabProdutoE.add(cxEstoqueQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 150, -1));
        jLabProdutoE.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 150, 10));

        jLabPreco1.setText("PREÇO");
        jLabProdutoE.add(jLabPreco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        cxEstoquePreco.setBackground(new java.awt.Color(231, 228, 228));
        cxEstoquePreco.setBorder(null);
        jLabProdutoE.add(cxEstoquePreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 150, -1));
        jLabProdutoE.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 150, 10));

        cxEstoqueCateg.setBackground(new java.awt.Color(231, 228, 228));
        cxEstoqueCateg.setBorder(null);
        cxEstoqueCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEstoqueCategActionPerformed(evt);
            }
        });
        jLabProdutoE.add(cxEstoqueCateg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 190, -1));
        jLabProdutoE.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 200, 10));

        jLabCategoria2.setText("CATEGORIA NOME");
        jLabProdutoE.add(jLabCategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btCadastrarViewUsuario.setText("Cadastrar");
        btCadastrarViewUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarViewUsuarioActionPerformed(evt);
            }
        });
        jLabProdutoE.add(btCadastrarViewUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        guiaViewCliente.addTab("tab1", jLabProdutoE);

        janelas.addTab("ViewEstoque", guiaViewCliente);

        jScrollPane8.setBackground(new java.awt.Color(231, 228, 228));

        jPanel5.setBackground(new java.awt.Color(231, 228, 228));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setBorder(null);

        tabRelatorioGeral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CLIENTE", "NOME", "SOBRENOME", "LOGIN", "SENHA", "EMAIL", "RUA", "NÚMERO", "CIDADE", "CEP", "ID PEDIDO", "TOTAL", "TRANSPORTADORA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabRelatorioGeral.setRowHeight(30);
        tabRelatorioGeral.setShowGrid(false);
        tabRelatorioGeral.setShowVerticalLines(true);
        tabRelatorioGeral.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tabRelatorioGeral);
        if (tabRelatorioGeral.getColumnModel().getColumnCount() > 0) {
            tabRelatorioGeral.getColumnModel().getColumn(0).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(0).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(1).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(2).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(2).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(3).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(3).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(4).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(4).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(5).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(5).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(6).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(6).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(7).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(7).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(8).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(8).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(9).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(9).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(10).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(10).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(11).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(11).setPreferredWidth(250);
            tabRelatorioGeral.getColumnModel().getColumn(12).setResizable(false);
            tabRelatorioGeral.getColumnModel().getColumn(12).setPreferredWidth(250);
        }

        jPanel5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1060, 270));

        jScrollPane8.setViewportView(jPanel5);

        guiaViewRelatorio.addTab("tab1", jScrollPane8);

        janelas.addTab("ViewRelatorio", guiaViewRelatorio);

        jPanel2.setBackground(new java.awt.Color(231, 228, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabFabricante.setText("FABRICANTE");
        jPanel2.add(jLabFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        cxCategoriaNome.setBackground(new java.awt.Color(231, 228, 228));
        cxCategoriaNome.setBorder(null);
        cxCategoriaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCategoriaNomeActionPerformed(evt);
            }
        });
        jPanel2.add(cxCategoriaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 190, -1));
        jPanel2.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 190, 10));

        tabFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FABRICANTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabFabricante.setRowHeight(30);
        tabFabricante.setShowGrid(false);
        tabFabricante.setShowHorizontalLines(true);
        tabFabricante.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tabFabricante);
        if (tabFabricante.getColumnModel().getColumnCount() > 0) {
            tabFabricante.getColumnModel().getColumn(0).setResizable(false);
            tabFabricante.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel2.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 690, 210));

        btCadastrarFab.setText("Cadastrar");
        btCadastrarFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFabActionPerformed(evt);
            }
        });
        jPanel2.add(btCadastrarFab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        btDeletarFab.setText("Deletar");
        btDeletarFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarFabActionPerformed(evt);
            }
        });
        jPanel2.add(btDeletarFab, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        btIrIate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btIrIate.setText("ir para Iate");
        btIrIate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btIrIateMouseClicked(evt);
            }
        });
        jPanel2.add(btIrIate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        guiaFabricante.addTab("tab1", jPanel2);

        janelas.addTab("Fabricante", guiaFabricante);

        MenuPrincipal.add(janelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 760, 570));

        ONoFF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ONoFF.setForeground(new java.awt.Color(255, 51, 51));
        ONoFF.setText("OFF");
        MenuPrincipal.add(ONoFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomeMouseClicked
        janelas.setSelectedIndex(0);
    }//GEN-LAST:event_btHomeMouseClicked

    private void btPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPedidoMouseClicked
        try {
            janelas.setSelectedIndex(2);
            listarTabPedido();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPedidoMouseClicked

    private void btEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEstoqueMouseClicked
        try {
            janelas.setSelectedIndex(3);
            listarTabProduto();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btEstoqueMouseClicked

    private void btTransportadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTransportadoraMouseClicked
        try {
            janelas.setSelectedIndex(4);
            listarTabTransportadora();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btTransportadoraMouseClicked

    private void btBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBackupMouseClicked
        try {
            janelas.setSelectedIndex(5);
            listarTabBackup();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBackupMouseClicked

    private void btViewClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btViewClienteMouseClicked
        try {
            janelas.setSelectedIndex(6);
            listarTabProdutosGerais();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btViewClienteMouseClicked

    private void btRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRelatorioMouseClicked
        try {
            janelas.setSelectedIndex(7);
            listarTabRelatorioGeral();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRelatorioMouseClicked

    private void btClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClientesMouseClicked
        try {
            janelas.setSelectedIndex(1 );
            listarTabCliente();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btClientesMouseClicked

    private void btCadastrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrar3ActionPerformed
        try {
            cadastrarTransportadora();
            listarTabTransportadora();
            limparCamposTransportadora();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadastrar3ActionPerformed

    private void cxProdFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxProdFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxProdFabricanteActionPerformed

    private void btCadastrarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarEstoqueActionPerformed
        try {
            cadastrarProduto();
            listarTabProduto();
            limparCamposProduto();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadastrarEstoqueActionPerformed

    private void btCadastrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarPedidoActionPerformed
        try {
            cadastrarPedido();
            listarTabPedido();
            limparCamposPedido();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadastrarPedidoActionPerformed

    private void btCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClienteActionPerformed
        try {
            cadastrarCliente();
            listarTabCliente();
            limparCamposCliente();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadastrarClienteActionPerformed

    private void cxClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClienteNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClienteNomeActionPerformed

    private void cxClienteLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClienteLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClienteLoginActionPerformed

    private void cxClienteSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClienteSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClienteSenhaActionPerformed

    private void cxClienteEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClienteEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClienteEmailActionPerformed

    private void cxClienteRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClienteRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClienteRuaActionPerformed

    private void cxClienteNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClienteNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClienteNumeroActionPerformed

    private void cxClienteCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClienteCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClienteCidadeActionPerformed

    private void cxClienteCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClienteCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClienteCepActionPerformed

    private void cxPedQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPedQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPedQuantidadeActionPerformed

    private void cxEstoqueCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEstoqueCategActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEstoqueCategActionPerformed

    private void btCadastrarViewUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarViewUsuarioActionPerformed
        try {
            cadastrarProdutosGerais();
            listarTabProdutosGerais();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadastrarViewUsuarioActionPerformed

    private void cxProdAnoFabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxProdAnoFabricacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxProdAnoFabricacaoActionPerformed

    private void btIrFabricanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIrFabricanteMouseClicked
        try {
            janelas.setSelectedIndex(8);
            listarTabCategoria();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btIrFabricanteMouseClicked

    private void cxCategoriaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCategoriaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCategoriaNomeActionPerformed

    private void btCadastrarFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFabActionPerformed
        try {
            cadastrarCategoria();
            listarTabCategoria();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadastrarFabActionPerformed

    private void btIrIateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIrIateMouseClicked
        try {
            janelas.setSelectedIndex(3);
            listarTabProduto();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btIrIateMouseClicked

    private void btDeletarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarPedidoActionPerformed
        try {
            deletarPedido();
            listarTabPedido();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeletarPedidoActionPerformed

    private void btDeletarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarEstoqueActionPerformed
        try {
            deletarProduto();
            listarTabProduto();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeletarEstoqueActionPerformed

    private void btDeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarClienteActionPerformed
        try {
            deletarCliente();
            listarTabCliente();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeletarClienteActionPerformed

    private void btDeletarFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarFabActionPerformed
        try {
            deletarCategoria();
            listarTabCategoria();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeletarFabActionPerformed

    private void btDeletar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletar3ActionPerformed
        try {
            deletarTransportadora();
            listarTabTransportadora();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeletar3ActionPerformed

    private void btUpdatarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdatarPedidoActionPerformed
        try {
            updatarPedido();
            listarTabPedido();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btUpdatarPedidoActionPerformed
    
    public void limparCamposCliente() {
        cxClienteNome.setText("");
        cxClienteSobrenome.setText("");
        cxClienteLogin.setText("");
        cxClienteSenha.setText("");
        cxClienteEmail.setText("");
        cxClienteRua.setText("");
        cxClienteNumero.setText("");
        cxClienteCidade.setText("");
        cxClienteCep.setText("");
    }
    
    public void limparCamposTransportadora() {
        cxTranspNome.setText("");
        cxTranspCnpj.setText("");
        cxTranspTel.setText("");
        cxTranspEmail.setText("");
    }
    
    public void limparCamposProduto() {
        cxProdAnoFabricacao.setText("");
        cxProdNome.setText("");
        cxProdFabricante.setText("");
        cxProdPreco.setText("");
    }
    
    public void limparCamposPedido() {
        cxPedQuantidade.setText("");
        cxPedProdutoID.setText("");
        cxPedTranspId.setText("");
        cxPedClienteId.setText("");
    }
    
    private void deletarCliente() throws ClassNotFoundException{
        int ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do cliente:", "Excluir Cliente", JOptionPane.QUESTION_MESSAGE));
        ClienteDao clienteDao = DaoFactory.createClienteDao();
        clienteDao.deleteById(ID);
    }
        
    private void cadastrarCliente() throws ClassNotFoundException{
        ClienteDao clienteDao = DaoFactory.createClienteDao();
        Cliente cli = new Cliente();
        cli.setClient_nome(cxClienteNome.getText());
        cli.setClient_sobrenome(cxClienteSobrenome.getText());
        cli.setClient_login(cxClienteLogin.getText());
        cli.setClient_senha(cxClienteSenha.getText());
        cli.setClient_email(cxClienteEmail.getText());
        cli.setClient_rua(cxClienteRua.getText());
        cli.setClient_num(Integer.parseInt(cxClienteNumero.getText()));
        cli.setClient_cidade(cxClienteCidade.getText());
        cli.setClient_cep(cxClienteCep.getText());
        clienteDao.insert(cli);
    }
    
    private void deletarTransportadora() throws ClassNotFoundException{
        int ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID da Transportadora:", "Excluir Transportadora", JOptionPane.QUESTION_MESSAGE));
        TransportadoraDao dao = DaoFactory.createTransportadoraDao();
        dao.deleteById(ID);
    }
    private void cadastrarTransportadora() throws ClassNotFoundException {
        TransportadoraDao transpDao = DaoFactory.createTransportadoraDao();
        Transportadora trans = new Transportadora();
        trans.setTransp_nome(cxTranspNome.getText());
        trans.setTransp_cnpj(cxTranspCnpj.getText());
        trans.setTransp_telefone(cxTranspTel.getText());
        trans.setTransp_email(cxTranspEmail.getText());
        transpDao.insert(trans);
    }
    
    private void deletarProduto() throws ClassNotFoundException{
        int ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do produto:", "Excluir Produto", JOptionPane.QUESTION_MESSAGE));
        ProdutoDao dao = DaoFactory.createProdutoDao();
        dao.deleteById(ID);
    }
    private void cadastrarProduto() throws ClassNotFoundException {
        ProdutoDao prodDao = DaoFactory.createProdutoDao();
        Produto prod = new Produto();
        prod.setProd_quantidade(Integer.parseInt(cxProdAnoFabricacao.getText()));
        prod.setProd_nome(cxProdNome.getText());
        prod.setCategoria_id(Integer.parseInt(cxProdFabricante.getText()));
        prod.setProd_preco(Float.parseFloat(cxProdPreco.getText()));
        prodDao.insert(prod);
    } 
    
    private void deletarPedido() throws ClassNotFoundException{
        int ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do pedido:", "Excluir Pedido", JOptionPane.QUESTION_MESSAGE));
        PedidoDao dao = DaoFactory.createPedidoDao();
        dao.deleteById(ID);
    }
    private void cadastrarPedido() throws ClassNotFoundException {
        PedidoDao pedDao = DaoFactory.createPedidoDao();
        Pedido ped = new Pedido();
        ped.setPed_id(Integer.parseInt(cxPedId.getText()));
        ped.setPed_quantidade(Integer.parseInt(cxPedQuantidade.getText()));
        ped.setProd_id(Integer.parseInt(cxPedProdutoID.getText()));
        ped.setTransp_id(Integer.parseInt(cxPedTranspId.getText()));
        ped.setClient_id(Integer.parseInt(cxPedClienteId.getText()));
        pedDao.insert(ped);
    }

    private void updatarPedido() throws ClassNotFoundException {
        PedidoDao pedDao = DaoFactory.createPedidoDao();
        Pedido ped = new Pedido();
        ped.setPed_id(Integer.parseInt(cxPedId.getText()));
        ped.setPed_quantidade(Integer.parseInt(cxPedQuantidade.getText()));
        ped.setProd_id(Integer.parseInt(cxPedProdutoID.getText()));
        ped.setTransp_id(Integer.parseInt(cxPedTranspId.getText()));
        ped.setClient_id(Integer.parseInt(cxPedClienteId.getText()));
        pedDao.updatar(ped);
    }
    private void deletarCategoria() throws ClassNotFoundException{
        int ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID da categoria:", "Excluir Categoria", JOptionPane.QUESTION_MESSAGE));
        CategoriaDao dao = DaoFactory.createCategoriaDao();
        dao.deleteById(ID);
    }
    private void cadastrarCategoria() throws ClassNotFoundException {
        CategoriaDao catDao = DaoFactory.createCategoriaDao();
        Categoria cat = new Categoria();
        cat.setCategoria_nome(cxCategoriaNome.getText());
        catDao.insert(cat);
        
    }
    
    private void cadastrarProdutosGerais() throws ClassNotFoundException{
        ProdutosGeraisDao pgDao = DaoFactory.createProdutosGeraisDao();
        ProdutosGerais pg = new ProdutosGerais();
        pg.setProd_anofabricacao(Integer.parseInt(cxEstoqueQuant.getText()));
        pg.setProd_nome(cxEstoqueProd.getText());
        pg.setProd_preco(Float.parseFloat(cxEstoquePreco.getText()));
        pg.setCategoria_nome(cxEstoqueCateg.getText());
        pgDao.insert(pg);
    }
    
    public void listarTabCliente() throws ClassNotFoundException {
        DefaultTableModel modelo = (DefaultTableModel)tabClientes.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);
        ClienteDao clienteDao = DaoFactory.createClienteDao();
        for(Cliente cli : clienteDao.findAll()) {
            modelo.insertRow(posLin, new Object []{cli.getClient_id(), cli.getClient_nome(), cli.getClient_sobrenome(), cli.getClient_login(), cli.getClient_senha(), cli.getClient_email(), cli.getClient_rua(), cli.getClient_num(), cli.getClient_cidade(), cli.getClient_cep()});
            posLin++;
        }
    }
    public void listarTabProduto() throws ClassNotFoundException {
        DefaultTableModel modelo = (DefaultTableModel)tabProdutos.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);
        ProdutoDao dao = DaoFactory.createProdutoDao();
        for(Produto cli : dao.findAll()) {
            modelo.insertRow(posLin, new Object []{cli.getProd_id(), cli.getProd_nome(), cli.getCategoria_id(), cli.getProd_quantidade(), cli.getProd_preco()});
            posLin++;
        }
    }
    public void listarTabPedido() throws ClassNotFoundException {
        DefaultTableModel modelo = (DefaultTableModel)tabPedidos.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);
        PedidoDao dao = DaoFactory.createPedidoDao();
        for(Pedido cli : dao.findAll()) {
            modelo.insertRow(posLin, new Object []{cli.getPed_id(), cli.getProd_id(), cli.getPed_quantidade(), cli.getTransp_id(), cli.getClient_id()});
            posLin++;
        }
    }
    public void listarTabTransportadora() throws ClassNotFoundException {
        DefaultTableModel modelo = (DefaultTableModel)tabTransportadora.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);
        TransportadoraDao dao = DaoFactory.createTransportadoraDao();
        for(Transportadora cli : dao.findAll()) {
            modelo.insertRow(posLin, new Object []{cli.getTransp_id(), cli.getTransp_nome(), cli.getTransp_cnpj(), cli.getTransp_telefone(), cli.getTransp_email()});
            posLin++;
        }
    }
    
    public void listarTabCategoria() throws ClassNotFoundException {
        DefaultTableModel modelo = (DefaultTableModel)tabFabricante.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);
        CategoriaDao dao = DaoFactory.createCategoriaDao();
        for(Categoria cli : dao.findAll()) {
            modelo.insertRow(posLin, new Object []{cli.getCategoria_id(), cli.getCategoria_nome()});
            posLin++;
        }
    }
    public void listarTabBackup() throws ClassNotFoundException {
        DefaultTableModel modelo = (DefaultTableModel)tabBackupVendas.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);
        BackupPedidoDao dao = DaoFactory.createBackupPedidoDao();
        for(BackupPedido cli : dao.findAll()) {
            modelo.insertRow(posLin, new Object []{cli.getPed_id(), cli.getPed_qnt(), cli.getProd_id(), cli.getTransp_id(), cli.getClient_id(), cli.getData_exclu()});
            posLin++;
        }
    }
    public void listarTabProdutosGerais() throws ClassNotFoundException {
        DefaultTableModel modelo = (DefaultTableModel)tabView.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);
        ProdutosGeraisDao dao = DaoFactory.createProdutosGeraisDao();
        for(ProdutosGerais cli : dao.findAll()) {
            modelo.insertRow(posLin, new Object []{cli.getCategoria_id(), cli.getProd_id(), cli.getProd_anofabricacao(), cli.getProd_nome(), cli.getProd_preco(), cli.getCategoria_nome()});
            posLin++;
        }
    }
    public void listarTabRelatorioGeral() throws ClassNotFoundException {
        DefaultTableModel modelo = (DefaultTableModel)tabRelatorioGeral.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);
        RelatorioGeralDao dao = DaoFactory.createRelatorioGeralDao();
        for(RelatorioGeral cli : dao.findAll()) {
            modelo.insertRow(posLin, new Object []{cli.getClient_id(), cli.getClient_nome(), cli.getClient_sobrenome(), cli.getClient_login(), cli.getClient_senha(), cli.getClient_email(), cli.getClient_rua(), cli.getClient_num(), cli.getClient_cidade(), cli.getClient_cep(), cli.getPed_id(), cli.getTotal(), cli.getTransp_nome()});
            posLin++;
        }
    }

    
    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabStatus;
    private javax.swing.JPanel MenuPrincipal;
    public static javax.swing.JLabel ONoFF;
    private javax.swing.JLabel btBackup;
    private javax.swing.JButton btCadastrar3;
    private javax.swing.JButton btCadastrarCliente;
    private javax.swing.JButton btCadastrarEstoque;
    private javax.swing.JButton btCadastrarFab;
    private javax.swing.JButton btCadastrarPedido;
    private javax.swing.JButton btCadastrarViewUsuario;
    private javax.swing.JLabel btClientes;
    private javax.swing.JButton btDeletar3;
    private javax.swing.JButton btDeletarCliente;
    private javax.swing.JButton btDeletarEstoque;
    private javax.swing.JButton btDeletarFab;
    private javax.swing.JButton btDeletarPedido;
    private javax.swing.JLabel btEstoque;
    private javax.swing.JLabel btHome;
    private javax.swing.JLabel btIrFabricante;
    private javax.swing.JLabel btIrIate;
    private javax.swing.JLabel btPedido;
    private javax.swing.JLabel btRelatorio;
    private javax.swing.JLabel btTransportadora;
    private javax.swing.JButton btUpdatarPedido;
    private javax.swing.JLabel btViewCliente;
    private javax.swing.JTextField cxCategoriaNome;
    private javax.swing.JTextField cxClienteCep;
    private javax.swing.JTextField cxClienteCidade;
    private javax.swing.JTextField cxClienteEmail;
    private javax.swing.JTextField cxClienteLogin;
    private javax.swing.JTextField cxClienteNome;
    private javax.swing.JTextField cxClienteNumero;
    private javax.swing.JTextField cxClienteRua;
    private javax.swing.JTextField cxClienteSenha;
    private javax.swing.JTextField cxClienteSobrenome;
    private javax.swing.JTextField cxEstoqueCateg;
    private javax.swing.JTextField cxEstoquePreco;
    private javax.swing.JTextField cxEstoqueProd;
    private javax.swing.JTextField cxEstoqueQuant;
    private javax.swing.JTextField cxPedClienteId;
    private javax.swing.JTextField cxPedId;
    private javax.swing.JTextField cxPedProdutoID;
    private javax.swing.JTextField cxPedQuantidade;
    private javax.swing.JTextField cxPedTranspId;
    private javax.swing.JTextField cxProdAnoFabricacao;
    private javax.swing.JTextField cxProdFabricante;
    private javax.swing.JTextField cxProdNome;
    private javax.swing.JTextField cxProdPreco;
    private javax.swing.JTextField cxTranspCnpj;
    private javax.swing.JTextField cxTranspEmail;
    private javax.swing.JTextField cxTranspNome;
    private javax.swing.JTextField cxTranspTel;
    private javax.swing.JTabbedPane guiaBackup;
    private javax.swing.JTabbedPane guiaClientes;
    private javax.swing.JTabbedPane guiaEstoques;
    private javax.swing.JTabbedPane guiaFabricante;
    private javax.swing.JTabbedPane guiaHome;
    private javax.swing.JTabbedPane guiaPedidos;
    private javax.swing.JTabbedPane guiaTransportadoras;
    private javax.swing.JTabbedPane guiaViewCliente;
    private javax.swing.JTabbedPane guiaViewRelatorio;
    private javax.swing.JPanel home;
    private javax.swing.JLabel iconClientes;
    private javax.swing.JLabel iconEstoque;
    private javax.swing.JLabel iconHome;
    private javax.swing.JLabel iconPostgresql;
    private javax.swing.JLabel iconTransportes;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel iconVendas;
    private javax.swing.JLabel jLabCategoria;
    private javax.swing.JLabel jLabCategoria2;
    private javax.swing.JLabel jLabCep1;
    private javax.swing.JLabel jLabCidade1;
    private javax.swing.JLabel jLabClienteID;
    private javax.swing.JLabel jLabCnpj;
    private javax.swing.JLabel jLabEmail1;
    private javax.swing.JLabel jLabFabricante;
    private javax.swing.JLabel jLabLogin1;
    private javax.swing.JLabel jLabNome1;
    private javax.swing.JLabel jLabNumero1;
    private javax.swing.JLabel jLabPedido;
    private javax.swing.JLabel jLabPreco;
    private javax.swing.JLabel jLabPreco1;
    private javax.swing.JLabel jLabPrecoP;
    private javax.swing.JLabel jLabProduto;
    private javax.swing.JLabel jLabProduto1;
    private javax.swing.JPanel jLabProdutoE;
    private javax.swing.JLabel jLabProdutoID;
    private javax.swing.JLabel jLabQuantidade;
    private javax.swing.JLabel jLabQuantidade1;
    private javax.swing.JLabel jLabQuantidadeP;
    private javax.swing.JLabel jLabRua1;
    private javax.swing.JLabel jLabSenha1;
    private javax.swing.JLabel jLabSobrenome1;
    private javax.swing.JLabel jLabTelefone;
    private javax.swing.JLabel jLabTransEmail;
    private javax.swing.JLabel jLabTransportadora;
    public static javax.swing.JLabel jLabUsuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelDIR;
    private javax.swing.JPanel jPanelESQ;
    private javax.swing.JPanel jPanelINF;
    private javax.swing.JPanel jPanelSUP;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JTabbedPane janelas;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel menu4;
    private javax.swing.JPanel menu5;
    private javax.swing.JTable tabBackupVendas;
    private javax.swing.JTable tabClientes;
    private javax.swing.JTable tabFabricante;
    private javax.swing.JTable tabPedidos;
    private javax.swing.JTable tabProdutos;
    private javax.swing.JTable tabRelatorioGeral;
    private javax.swing.JTable tabTransportadora;
    private javax.swing.JTable tabView;
    // End of variables declaration//GEN-END:variables
}
